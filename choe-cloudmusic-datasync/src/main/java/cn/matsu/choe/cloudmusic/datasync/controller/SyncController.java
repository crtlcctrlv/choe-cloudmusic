package cn.matsu.choe.cloudmusic.datasync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import cn.matsu.choe.cloudmusic.datasync.constant.WorkType;
import cn.matsu.choe.cloudmusic.datasync.mapper.music.AlbumExtMapper;
import cn.matsu.choe.cloudmusic.datasync.service.ArtistSyncService;
import cn.matsu.choe.cloudmusic.datasync.service.CommentSyncService;
import cn.matsu.choe.cloudmusic.datasync.service.SyncService;

@RestController
public class SyncController {

  @Autowired
  private SyncService syncService;

  @Autowired
  private ArtistSyncService artistSyncService;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private AlbumExtMapper albumExtMapper;

  @Autowired
  private CommentSyncService commentSyncService;

  @GetMapping("/sync/comment/album/{albumId}")
  public String syncAlbumComment(@PathVariable Integer albumId) {
    commentSyncService.syncComment(albumId, WorkType.ALBUM);

    return "success";
  }

  @GetMapping("/sync/comment/song/{songId}")
  public String syncSongComment(@PathVariable Integer songId) {
    commentSyncService.syncComment(songId, WorkType.SONG);

    return "success";
  }

  @GetMapping("/sync/artist/{artistId}")
  public String syncArtistResource(@PathVariable Integer artistId) {

    syncService.syncArtistInfo(artistId);

    syncService.albumTask(artistId);

    return "success";

  }

  @GetMapping("/sync/artist/bycategory")
  public String syncArtistByCategory(@RequestParam String categoryType) {
    artistSyncService.syncArtistInfoByCategory(categoryType);

    return "success";
  }

}
