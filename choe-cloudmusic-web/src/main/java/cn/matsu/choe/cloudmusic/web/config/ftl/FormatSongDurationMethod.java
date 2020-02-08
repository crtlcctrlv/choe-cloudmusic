package cn.matsu.choe.cloudmusic.web.config.ftl;

import java.util.List;
import org.joda.time.DateTime;
import cn.matsu.choe.cloudmusic.web.util.DateUtil;
import freemarker.template.SimpleNumber;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

public class FormatSongDurationMethod implements TemplateMethodModelEx {

  @Override
  public Object exec(@SuppressWarnings("rawtypes") List arguments) throws TemplateModelException {

    if (arguments == null || arguments.size() != 1) {
      throw new TemplateModelException("arguments illegal");
    }

    SimpleNumber simpleNumber = (SimpleNumber) arguments.get(0);

    long duration = simpleNumber.getAsNumber().longValue();

    return new DateTime(duration).toString(DateUtil.SONG_DURATION_FORMAT);

  }

}
