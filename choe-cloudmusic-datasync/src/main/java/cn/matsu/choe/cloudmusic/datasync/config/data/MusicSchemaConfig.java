package cn.matsu.choe.cloudmusic.datasync.config.data;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = "cn.matsu.choe.cloudmusic.datasync.mapper.music",
    sqlSessionTemplateRef = "musicSqlSessionTemplate")
public class MusicSchemaConfig {

  @Bean
  @ConfigurationProperties("spring.datasource.music")
  public DataSourceProperties musicDataSourceProperties() {
    return new DataSourceProperties();
  }

  @Bean
  public DataSource musicDataSource(DataSourceProperties musicDataSourceProperties) {
    return musicDataSourceProperties.initializeDataSourceBuilder().build();
  }

  @Bean
  public DataSourceTransactionManager musicTransactionManager(DataSource musicDataSource) {
    return new DataSourceTransactionManager(musicDataSource);
  }

  @Bean
  public SqlSessionFactory musicSqlSessionFactory(DataSource musicDataSource) throws Exception {
    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(musicDataSource);
    sessionFactory.setMapperLocations(
        new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/music/*.xml"));
    return sessionFactory.getObject();
  }

  @Bean
  public SqlSessionTemplate musicSqlSessionTemplate(SqlSessionFactory musicSqlSessionFactory) {
    return new SqlSessionTemplate(musicSqlSessionFactory);
  }

}
