package com.seafwg.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Configuration: 声明是一个配置类
 * @Bean 注入到spring容器中
 * @ConfigrationProperties(prefix='jdbc') 使用@ConfigurationProperties在方法上面使用直接
 * 声明要注入的属性前缀，Spring Boot会自动把相关属性通过set方法注入到DataSource中
 * 我们直接把 @ConfigurationProperties(prefix = "jdbc") 声明在需要使用的 @Bean 的方法上，然后Spring
 * Boot就会自动调用这个Bean（此处是DataSource）的set方法，然后完成注入。使用的前提是：该类必须有对应属
 * 性的set方法！
 */

@Configuration
public class JdbcConfigProperties {

//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource dataSourceDruid() {
//        return new DruidDataSource();
//    }
}
