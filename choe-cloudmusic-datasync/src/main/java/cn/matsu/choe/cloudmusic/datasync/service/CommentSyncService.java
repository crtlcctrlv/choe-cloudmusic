package cn.matsu.choe.cloudmusic.datasync.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import cn.matsu.choe.cloudmusic.datasync.constant.WorkType;
import cn.matsu.choe.cloudmusic.datasync.entity.po.Comment;
import cn.matsu.choe.cloudmusic.datasync.mapper.comment.CommentExtMapper;
import cn.matsu.choe.cloudmusic.datasync.util.PageUtil;

@Service
public class CommentSyncService extends BaseSyncService {

  // 分页参数,取上一页最后一个评论的时间戳以获取下一页数据
  private long lastPageLastCommentTime = 0L;

  private final String songCommentUrl = "/comment/music?id={id}&limit={limit}&offset={offset}";

  private final String albumCommentUrl = "/comment/album?id={id}&limit={limit}&offset={offset}";

  @Autowired
  private CommentExtMapper commentExtMapper;

  private String getNodeServerUrl(WorkType workType) {
    if (workType == WorkType.ALBUM) {
      return albumCommentUrl;
    } else if (workType == WorkType.SONG) {
      return songCommentUrl;
    }

    return albumCommentUrl;
  }

  private void setLastPageLastCommentTime(JSONArray commentJsonArr) {
    lastPageLastCommentTime =
        commentJsonArr.getJSONObject(commentJsonArr.size() - 1).getLongValue("time");
  }

  public void syncComment(Integer workId, WorkType workType) {

    String url = getNodeServerUrl(workType);

    int limit = 100;

    // 第一页
    JSONObject firstPageJsonBody = getBodyJson(url, workId, limit, 0);

    setLastPageLastCommentTime(firstPageJsonBody.getJSONArray("comments"));

    saveCommentList(firstPageJsonBody.getJSONArray("comments"), workId, workType);

    int total = firstPageJsonBody.getIntValue("total");

    // 获得页数后 从第二页开始查询
    for (int i = 2; i <= PageUtil.totalPage(total, limit); i++) {

      JSONObject body = getBodyJson(url + "&before={before}", workId, limit,
          PageUtil.getStart(i, limit), lastPageLastCommentTime);

      JSONArray commentJsonArr = body.getJSONArray("comments");

      setLastPageLastCommentTime(commentJsonArr);

      saveCommentList(commentJsonArr, workId, workType);

    }

  }

  private void saveCommentList(JSONArray commentJsonArr, Integer workId, WorkType workType) {

    List<Comment> records = new ArrayList<>();

    if (commentJsonArr == null || commentJsonArr.size() == 0) {
      return;
    }

    int size = commentJsonArr.size();

    for (int j = 0; j < size; j++) {

      JSONObject commentJson = commentJsonArr.getJSONObject(j);

      Date createTime = new Date(commentJson.getLongValue("time"));

      Comment record = new Comment();
      record.setCommentId(commentJson.getInteger("commentId"));
      record.setContent(commentJson.getString("content"));

      record.setWorkId(workId);
      record.setWorkType(workType.name());
      record.setUserId(commentJson.getJSONObject("user").getInteger("userId"));
      record.setParentCommentId(commentJson.getInteger("parentCommentId"));
      record.setLikeCount(commentJson.getInteger("likedCount"));
      record.setCreateTime(createTime);
      record.setUpdateTime(createTime);

      records.add(record);

    }

    commentExtMapper.insertList(records);
  }
}
