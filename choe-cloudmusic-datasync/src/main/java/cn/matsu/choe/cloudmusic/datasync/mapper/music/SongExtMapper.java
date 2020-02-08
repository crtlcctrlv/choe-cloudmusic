package cn.matsu.choe.cloudmusic.datasync.mapper.music;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import cn.matsu.choe.cloudmusic.datasync.entity.po.Song;

public interface SongExtMapper {

  @Select("select * from song where album_id = #{albumId}")
  List<Song> findByAlbumId(Integer albumId);

  void insertList(List<Song> list);

}
