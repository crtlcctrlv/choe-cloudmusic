package cn.matsu.choe.cloudmusic.datasync.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Joiner;
import cn.matsu.choe.cloudmusic.datasync.entity.po.Artist;
import cn.matsu.choe.cloudmusic.datasync.mapper.music.ArtistExtMapper;

@Service
public class ArtistSyncService extends BaseSyncService {

  private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

  @Autowired
  private ArtistExtMapper artistExtMapper;

  public void syncArtistInfoByCategory(String categoryType) {

    for (char c : ALPHABET.toCharArray()) {

      JSONObject content =
          getBodyJson("/artist/list?cat={cat}&initial={initial}&limit=100&offset=0", categoryType,
              String.valueOf(c));

      JSONArray artistJsonArr = content.getJSONArray("artists");

      Date now = new Date();

      List<Artist> records = new ArrayList<>();

      for (int i = 0; i < artistJsonArr.size(); i++) {
        JSONObject artistJson = artistJsonArr.getJSONObject(i);

        Artist record = new Artist();
        record.setArtistId(artistJson.getInteger("id"));
        record.setPicUrl(artistJson.getString("picUrl"));
        record.setName(artistJson.getString("name"));
        record.setCategory(categoryType);
        record.setInitial(String.valueOf(c));
        record.setBriefDesc("");
        record.setAlias(
            Joiner.on(';').join(artistJson.getJSONArray("alias").toJavaList(String.class)));

        record.setMusicSize(artistJson.getShort("musicSize"));
        record.setAlbumSize(artistJson.getShort("albumSize"));
        record.setMvSize((short) 0);

        record.setCreateTime(now);
        record.setUpdateTime(now);

        records.add(record);
      }

      artistExtMapper.insertList(records);
    }

  }

}
