package cn.matsu.choe.cloudmusic.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import cn.matsu.choe.cloudmusic.web.component.MusicDataHolder;
import cn.matsu.choe.cloudmusic.web.entity.po.Artist;
import cn.matsu.choe.cloudmusic.web.entity.vo.ArtistCategoryVO;
import cn.matsu.choe.cloudmusic.web.mapper.ArtistExtMapper;

@Controller
public class ArtistDiscoverController {

  @Autowired
  private ArtistExtMapper artistExtMapper;

  @GetMapping("/artist/discover")
  public String discover(Model model) {

    List<ArtistCategoryVO> categories = MusicDataHolder.getArtistCategories();

    model.addAttribute("categories", categories);

    return "artist_discover";

  }

  @ResponseBody
  @GetMapping(path = "/artist/discover/list", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Artist> getIntro(@RequestParam String category, @RequestParam String initial) {

    PageHelper.startPage(1, 100, false);

    List<Artist> artists =
        artistExtMapper.findByCategoryAndInitial(category, initial.toLowerCase());

    return artists;

  }

}
