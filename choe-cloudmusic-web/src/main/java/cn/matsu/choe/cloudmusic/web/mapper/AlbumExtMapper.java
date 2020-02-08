package cn.matsu.choe.cloudmusic.web.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import cn.matsu.choe.cloudmusic.web.entity.po.Album;

public interface AlbumExtMapper {

  @Select("select * from album where album_id = #{albumId}")
  Album findByAlbumId(Integer albumId);

  @Select("select comment_count from album where album_id = #{albumId}")
  int getCommentCount(Integer albumId);

  @Select("select album_id, name, pic_url, publish_time from album where artist_id = #{artistId} order by publish_time desc")
  List<Album> findByArtistId4Grid(Integer artistId);

}
