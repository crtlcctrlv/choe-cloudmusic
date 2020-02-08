package cn.matsu.choe.cloudmusic.datasync.config.data;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages = "cn.matsu.choe.cloudmusic.datasync.mapper.comment",
    sqlSessionTemplateRef = "commentSqlSessionTemplate")
public class CommentSchemaConfig {

  @Bean
  public SqlSessionFactory commentSqlSessionFactory(DataSource dataSource) throws Exception {
    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(dataSource);
    sessionFactory.setMapperLocations(
        new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/comment/*.xml"));
    return sessionFactory.getObject();
  }

  @Bean
  public SqlSessionTemplate commentSqlSessionTemplate(SqlSessionFactory commentSqlSessionFactory) {
    return new SqlSessionTemplate(commentSqlSessionFactory);
  }

}
