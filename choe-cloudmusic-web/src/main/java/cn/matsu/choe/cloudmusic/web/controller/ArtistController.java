package cn.matsu.choe.cloudmusic.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.google.common.base.Strings;
import cn.matsu.choe.cloudmusic.web.entity.model.ArtistIntro;
import cn.matsu.choe.cloudmusic.web.entity.po.Album;
import cn.matsu.choe.cloudmusic.web.entity.po.Artist;
import cn.matsu.choe.cloudmusic.web.entity.vo.PageVO;
import cn.matsu.choe.cloudmusic.web.mapper.AlbumExtMapper;
import cn.matsu.choe.cloudmusic.web.mapper.ArtistExtMapper;

@Controller
public class ArtistController {

  @Autowired
  private ArtistExtMapper artistExtMapper;

  @Autowired
  private AlbumExtMapper albumExtMapper;

  @GetMapping(value = "/artist/{artistId}")
  public String index(@PathVariable Integer artistId, Model model) {

    Artist artist = artistExtMapper.findByArtistId(artistId);

    model.addAttribute("artist", artist);

    String introJson = artist.getIntroduction();

    if (!Strings.isNullOrEmpty(introJson)) {
      List<ArtistIntro> intros = JSON.parseArray(introJson, ArtistIntro.class);

      model.addAttribute("intros", intros);
    }

    return "artist";
  }

  @ResponseBody
  @GetMapping(path = "/artist/intro", produces = MediaType.APPLICATION_JSON_VALUE)
  public JSONArray getIntro(@RequestParam Integer artistId) {

    String intro = artistExtMapper.getIntroByArtistId(artistId);

    return JSONArray.parseArray(intro);

  }

  @ResponseBody
  @GetMapping(path = "/artist/albums", produces = MediaType.APPLICATION_JSON_VALUE)
  public PageVO<Album> getAlbums(@RequestParam Integer artistId, @RequestParam Integer pageNum,
      @RequestParam Integer pageSize) {

    PageHelper.startPage(pageNum, pageSize);

    List<Album> albums = albumExtMapper.findByArtistId4Grid(artistId);

    PageVO<Album> vo = new PageVO<>(pageNum, pageSize, ((Page<Album>) albums).getTotal(), albums);

    return vo;
  }

}
