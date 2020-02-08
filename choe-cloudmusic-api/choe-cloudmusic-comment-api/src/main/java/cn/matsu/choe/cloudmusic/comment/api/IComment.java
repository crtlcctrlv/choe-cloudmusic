package cn.matsu.choe.cloudmusic.comment.api;

import java.util.List;
import cn.matsu.choe.cloudmusic.comment.bo.CommentBO;

public interface IComment {

  List<CommentBO> getAlbumComments(Integer albumId);

}
