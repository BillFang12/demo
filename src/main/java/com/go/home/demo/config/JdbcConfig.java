package com.go.home.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("")
public class JdbcConfig {

    @Bean
    public DataSource dataSource(){
       DruidDataSource dataSource=new DruidDataSource();
       dataSource.setUsername("");
        return dataSource;
    }

}
