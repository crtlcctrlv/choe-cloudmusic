package cn.matsu.choe.cloudmusic.datasync.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
public class MusicDataSyncConfig {

  @Bean
  public HttpMessageConverters customConverters() {
    FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
    return new HttpMessageConverters(fastJsonConverter);
  }

  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
    RestTemplate restTemplate = restTemplateBuilder.build();
    return restTemplate;
  }

}
