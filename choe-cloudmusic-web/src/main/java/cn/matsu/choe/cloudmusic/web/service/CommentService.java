package cn.matsu.choe.cloudmusic.web.service;

import java.util.List;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import cn.matsu.choe.cloudmusic.comment.api.IComment;
import cn.matsu.choe.cloudmusic.comment.bo.CommentBO;

@Service
public class CommentService {

  @Reference(version = "${comment.service.version}", url = "${comment.service.url}")
  private IComment iComment;

  public List<CommentBO> getAlbumComments(Integer albumId) {
    return iComment.getAlbumComments(albumId);
  }

}
