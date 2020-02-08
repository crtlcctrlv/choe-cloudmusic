package cn.matsu.choe.cloudmusic.web.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import cn.matsu.choe.cloudmusic.web.config.ftl.FormatSongDurationMethod;

@Configuration
public class MusicWebConfig {

  @Bean
  public HttpMessageConverters customConverters() {
    FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
    return new HttpMessageConverters(fastJsonConverter);
  }

  @Bean
  public FreeMarkerConfigurer freeMarkerConfigurer(FreeMarkerProperties properties) {
    FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();

    configurer.setTemplateLoaderPaths(properties.getTemplateLoaderPath());
    configurer.setPreferFileSystemAccess(properties.isPreferFileSystemAccess());
    configurer.setDefaultEncoding(properties.getCharsetName());
    Properties settings = new Properties();
    settings.putAll(properties.getSettings());
    configurer.setFreemarkerSettings(settings);

    // custom
    Map<String, Object> variables = new HashMap<>();
    variables.put("formatSongDuration", new FormatSongDurationMethod());
    configurer.setFreemarkerVariables(variables);

    return configurer;
  }


}
