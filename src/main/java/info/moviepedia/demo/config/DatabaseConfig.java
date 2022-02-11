package info.moviepedia.demo.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "info.moviepedia.demo")
public class DatabaseConfig {
    //DataSource 설정 (DB 접속정보 설정)
    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/moviepedia?characterEncoding=UTF-8&serverTimezone=UTC");
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setUsername("root");
        config.setPassword("1234");

        return new HikariDataSource(config);


    }
}
