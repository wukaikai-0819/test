package com.sh.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Deacription TODO
 * @Author 石晗
 * @Date 2020/12/4 22:19
 * @Version 1.0
 **/
@Configuration
public class DataSourceConfig {

    //默认使用Hikari连接池,若使用druid需自己写配置类,就是当前类,eg:

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDruidDataSource(){
        return new DruidDataSource();
    }
}
