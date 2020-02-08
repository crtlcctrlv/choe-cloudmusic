package cn.matsu.choe.cloudmusic.web.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.matsu.choe.cloudmusic.web.entity.po.Artist;
import cn.matsu.choe.cloudmusic.web.entity.po.ArtistExample;

public interface ArtistMapper {
    long countByExample(ArtistExample example);

    int deleteByExample(ArtistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Artist record);

    int insertSelective(Artist record);

    List<Artist> selectByExampleWithBLOBs(ArtistExample example);

    List<Artist> selectByExample(ArtistExample example);

    Artist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Artist record, @Param("example") ArtistExample example);

    int updateByExampleWithBLOBs(@Param("record") Artist record, @Param("example") ArtistExample example);

    int updateByExample(@Param("record") Artist record, @Param("example") ArtistExample example);

    int updateByPrimaryKeySelective(Artist record);

    int updateByPrimaryKeyWithBLOBs(Artist record);

    int updateByPrimaryKey(Artist record);
}