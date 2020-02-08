package cn.matsu.choe.cloudmusic.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.matsu.choe.cloudmusic.web.mapper")
public class MusicWebApplication {
  public static void main(String[] args) throws Exception {
    SpringApplication.run(MusicWebApplication.class, args);
  }
}
