package cn.matsu.choe.cloudmusic.datasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MusicDataSyncApplication {
  public static void main(String[] args) throws Exception {
    SpringApplication.run(MusicDataSyncApplication.class, args);
  }
}
