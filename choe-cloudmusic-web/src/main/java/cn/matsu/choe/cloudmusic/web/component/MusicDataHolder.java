package cn.matsu.choe.cloudmusic.web.component;

import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import cn.matsu.choe.cloudmusic.web.entity.vo.ArtistCategoryVO;
import cn.matsu.choe.cloudmusic.web.mapper.ArtistCategoryExtMapper;

@Component
public class MusicDataHolder implements CommandLineRunner {

  private static final Logger logger = LoggerFactory.getLogger(MusicDataHolder.class);

  private static List<ArtistCategoryVO> artistCategories;

  @Autowired
  private ArtistCategoryExtMapper artistCategoryExtMapper;

  @Override
  public void run(String... args) throws Exception {
    List<ArtistCategoryVO> categories = artistCategoryExtMapper.findAll();

    List<ArtistCategoryVO> firstCategories =
        categories.stream().filter(c -> c.getParentId() == 0).collect(Collectors.toList());

    for (ArtistCategoryVO first : categories) {
      List<ArtistCategoryVO> secondCategories =
          categories.stream().filter(c -> c.getParentId() == first.getCategoryId().intValue())
              .collect(Collectors.toList());
      first.setSubList(secondCategories);
    }

    artistCategories = firstCategories;

    logger.info("music data holder start up success, artistCategory size {}.",
        artistCategories.size());

  }

  public static List<ArtistCategoryVO> getArtistCategories() {
    return artistCategories;
  }

}
