package cn.matsu.choe.cloudmusic.comment.bo;

import java.io.Serializable;

public class CommentBO implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer commentId;

  private Integer parentCommentId;

  public Integer getCommentId() {
    return commentId;
  }

  public void setCommentId(Integer commentId) {
    this.commentId = commentId;
  }

  public Integer getParentCommentId() {
    return parentCommentId;
  }

  public void setParentCommentId(Integer parentCommentId) {
    this.parentCommentId = parentCommentId;
  }

}
