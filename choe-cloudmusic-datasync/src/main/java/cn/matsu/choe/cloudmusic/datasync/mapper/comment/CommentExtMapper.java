package cn.matsu.choe.cloudmusic.datasync.mapper.comment;

import java.util.List;
import cn.matsu.choe.cloudmusic.datasync.entity.po.Comment;

public interface CommentExtMapper {

  void insertList(List<Comment> list);

}
