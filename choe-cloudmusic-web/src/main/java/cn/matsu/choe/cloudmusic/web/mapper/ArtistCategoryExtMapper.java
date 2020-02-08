package cn.matsu.choe.cloudmusic.web.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import cn.matsu.choe.cloudmusic.web.entity.vo.ArtistCategoryVO;

public interface ArtistCategoryExtMapper {

  @Select("select category_id, name, parent_id from artist_category")
  List<ArtistCategoryVO> findAll();

}
