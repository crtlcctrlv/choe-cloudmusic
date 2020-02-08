package cn.matsu.choe.cloudmusic.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import cn.matsu.choe.cloudmusic.comment.bo.CommentBO;
import cn.matsu.choe.cloudmusic.web.entity.po.Album;
import cn.matsu.choe.cloudmusic.web.entity.po.Song;
import cn.matsu.choe.cloudmusic.web.mapper.AlbumExtMapper;
import cn.matsu.choe.cloudmusic.web.mapper.SongExtMapper;
import cn.matsu.choe.cloudmusic.web.service.CommentService;

@Controller
public class AlbumController {

  @Autowired
  private AlbumExtMapper albumExtMapper;

  @Autowired
  private SongExtMapper songExtMapper;

  @Autowired
  private CommentService commentService;

  @GetMapping("/album/{albumId}")
  public String index(@PathVariable Integer albumId, Model model) {

    Album album = albumExtMapper.findByAlbumId(albumId);

    List<Song> songs = songExtMapper.findByAlbumId(albumId);

    model.addAttribute("album", album);
    model.addAttribute("songs", songs);

    List<CommentBO> commentBOList = commentService.getAlbumComments(albumId);

    System.out.println(commentBOList.size());

    return "album";

  }

}
