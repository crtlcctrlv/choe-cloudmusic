package cn.matsu.choe.cloudmusic.web.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.matsu.choe.cloudmusic.web.entity.po.ArtistCategory;
import cn.matsu.choe.cloudmusic.web.entity.po.ArtistCategoryExample;

public interface ArtistCategoryMapper {
    long countByExample(ArtistCategoryExample example);

    int deleteByExample(ArtistCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArtistCategory record);

    int insertSelective(ArtistCategory record);

    List<ArtistCategory> selectByExample(ArtistCategoryExample example);

    ArtistCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArtistCategory record, @Param("example") ArtistCategoryExample example);

    int updateByExample(@Param("record") ArtistCategory record, @Param("example") ArtistCategoryExample example);

    int updateByPrimaryKeySelective(ArtistCategory record);

    int updateByPrimaryKey(ArtistCategory record);
}