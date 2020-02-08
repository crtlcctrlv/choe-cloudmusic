package cn.matsu.choe.cloudmusic.comment.bootstrap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class CommentBootstrap {

  public static void main(String[] args) {
    new SpringApplicationBuilder(CommentBootstrap.class).run(args);
  }

}
