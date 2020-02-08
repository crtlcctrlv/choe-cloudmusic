package cn.matsu.choe.cloudmusic.datasync.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Joiner;
import cn.matsu.choe.cloudmusic.datasync.entity.po.Album;
import cn.matsu.choe.cloudmusic.datasync.entity.po.Artist;
import cn.matsu.choe.cloudmusic.datasync.entity.po.Song;
import cn.matsu.choe.cloudmusic.datasync.mapper.music.SongExtMapper;

@Service
public class SyncService {

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private SongExtMapper songExtMapper;

  private void syncAlbumAndSongs(List<Integer> albumIds) {

    for (Integer albumId : albumIds) {
      JSONObject bodyJson = restTemplate
          .getForEntity("http://localhost:3000/album?id={id}", JSONObject.class, albumId).getBody();

      JSONArray songJsonArr = bodyJson.getJSONArray("songs");

      JSONObject albumJson = bodyJson.getJSONObject("album");

      JSONObject artistJson = albumJson.getJSONObject("artist");

      syncAlbum(albumJson, artistJson);

      syncSongs(songJsonArr, albumJson, artistJson);
    }

  }

  private void syncAlbum(JSONObject albumJson, JSONObject artistJson) {

    Date now = new Date();

    JSONObject infoJson = albumJson.getJSONObject("info");

    Album record = new Album();
    record.setAlbumId(albumJson.getInteger("id"));

    JSONArray aliasJsonArr = albumJson.getJSONArray("alias");
    if (aliasJsonArr.size() > 0) {
      record.setAlias(aliasJsonArr.get(0).toString());
    }

    record.setArtistId(artistJson.getInteger("id"));
    record.setArtistName(artistJson.getString("name"));

    record.setPicUrl(albumJson.getString("picUrl"));
    record.setCompany(albumJson.getString("company"));
    record.setDescription(albumJson.getString("description"));

    record.setName(albumJson.getString("name"));

    record.setCommentThreadId(albumJson.getString("commentThreadId"));

    record.setSize(albumJson.getShort("size"));

    record.setCommentCount(infoJson.getInteger("commentCount"));
    record.setShareCount(infoJson.getInteger("shareCount"));

    record.setPublishTime(new Date(albumJson.getLong("publishTime")));

    record.setCreateTime(now);
    record.setUpdateTime(now);

    // albumMapper.insert(record);

  }

  private void syncSongs(JSONArray songJsonArr, JSONObject albumJsonObj, JSONObject artistJsonObj) {

    Date now = new Date();

    List<Song> songs = new ArrayList<>();

    for (int i = 0; i < songJsonArr.size(); i++) {

      Song song = new Song();

      JSONObject songJson = songJsonArr.getJSONObject(i);

      song.setSongId(songJson.getInteger("id"));
      song.setName(songJson.getString("name"));
      song.setAlbumId(albumJsonObj.getInteger("id"));
      song.setAlbumName(albumJsonObj.getString("name"));

      song.setArtistId(artistJsonObj.getInteger("id"));
      song.setArtistName(artistJsonObj.getString("name"));

      song.setDuration(songJson.getInteger("dt"));
      song.setMvId(songJson.getInteger("mv"));

      song.setCreateTime(now);
      song.setUpdateTime(now);

      songs.add(song);
    }

    songExtMapper.insertList(songs);

  }

  public void syncArtistInfo(Integer artistId) {
    JSONObject content = restTemplate
        .getForEntity("http://localhost:3000/artists?id={id}", JSONObject.class, artistId)
        .getBody();

    JSONObject introContent = restTemplate
        .getForEntity("http://localhost:3000/artist/desc?id={id}", JSONObject.class, artistId)
        .getBody();

    Date now = new Date();

    JSONObject artistJson = content.getJSONObject("artist");

    Artist record = new Artist();
    record.setArtistId(artistId);
    record.setPicUrl(artistJson.getString("picUrl"));
    record.setName(artistJson.getString("name"));
    record.setBriefDesc(artistJson.getString("briefDesc"));
    record.setAlias(Joiner.on(';').join(artistJson.getJSONArray("alias").toJavaList(String.class)));

    record.setMusicSize(artistJson.getShort("musicSize"));
    record.setAlbumSize(artistJson.getShort("albumSize"));
    record.setMvSize(artistJson.getShort("mvSize"));

    record.setIntroduction(introContent.getString("introduction"));

    record.setCreateTime(now);
    record.setUpdateTime(now);
    // artistMapper.insert(record);
  }

  public void albumTask(Integer artistId) {
    JSONObject bodyJson =
        restTemplate.getForEntity("http://localhost:3000/artist/album?id={id}&limit=500",
            JSONObject.class, artistId).getBody();

    JSONArray albumJsonArr = bodyJson.getJSONArray("hotAlbums");

    List<Integer> albumIds = new ArrayList<>();
    for (int i = 0; i < albumJsonArr.size(); i++) {
      albumIds.add(albumJsonArr.getJSONObject(i).getInteger("id"));
    }

    syncAlbumAndSongs(albumIds);

  }

}
