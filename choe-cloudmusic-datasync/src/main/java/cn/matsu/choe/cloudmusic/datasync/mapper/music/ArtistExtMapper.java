package cn.matsu.choe.cloudmusic.datasync.mapper.music;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import cn.matsu.choe.cloudmusic.datasync.entity.po.Artist;

public interface ArtistExtMapper {

  @Select("select * from artist where artist_id = #{artistId}")
  Artist findByArtistId(Integer artistId);

  @Select("select artist_id, name, alias, pic_url from artist where category = #{category}")
  List<Artist> findByCategory(String category);

  @Select("select artist_id, name, pic_url from artist where category = #{category} and initial = #{initial}")
  List<Artist> findByCategoryAndInitial(@Param("category") String category,
      @Param("initial") String initial);

  @Select("select introduction from artist where artist_id = #{artistId}")
  String getIntroByArtistId(Integer artistId);

  void insertList(List<Artist> list);

}
