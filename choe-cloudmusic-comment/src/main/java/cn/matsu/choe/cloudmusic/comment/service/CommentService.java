package cn.matsu.choe.cloudmusic.comment.service;

import java.util.ArrayList;
import java.util.List;
import org.apache.dubbo.config.annotation.Service;
import cn.matsu.choe.cloudmusic.comment.api.IComment;
import cn.matsu.choe.cloudmusic.comment.bo.CommentBO;

@Service(version = "${comment.service.version}")
public class CommentService implements IComment {

  @Override
  public List<CommentBO> getAlbumComments(Integer albumId) {
    List<CommentBO> comments = new ArrayList<>();

    CommentBO comment = new CommentBO();
    comment.setCommentId(1);
    comment.setParentCommentId(0);

    comments.add(comment);

    return comments;
  }

}
