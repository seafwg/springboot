package com.seafwg.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * ## 配置类：
 * @Configuration 声明是一个配置类
 * @PropertySource 指定属性文件的路径是classpath:jdbc.properties
 * @Value 为属性注入值
 * @Bean 将方法声明为一个Bean的方法 Spring会自动调用该方法，将方法的返回值加入Spring容器中。可以在任意位置通过 @Autowired 注入DataSource了
 *
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//    @Value("${jdbc.url}")
//    String url;
//    @Value("${jdbc.username}")
//    String username;
//    @Value("${jdbc.password}")
//    String password;

//    @Bean
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
}
