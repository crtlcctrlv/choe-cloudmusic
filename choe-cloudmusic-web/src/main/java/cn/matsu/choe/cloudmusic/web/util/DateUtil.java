package cn.matsu.choe.cloudmusic.web.util;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtil {

  public static final String SONG_DURATION_PATTERN = "mm:ss";

  public static final DateTimeFormatter SONG_DURATION_FORMAT =
      DateTimeFormat.forPattern(SONG_DURATION_PATTERN);

}
