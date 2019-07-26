package com.accp.base;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Properties;

@SpringBootApplication
@ComponentScan(basePackages = "com.accp")
@MapperScan(basePackages = "com.accp.mapper")
public class InitAction {
    public static void main(String[] args) {
        SpringApplication.run(InitAction.class,args);
    }


    @Bean
    public PageHelper getPageHelper(){
        PageHelper pagehelper = new PageHelper();
        Properties pro  = new Properties();
        pro.setProperty("dialect","mysql");
        pagehelper.setProperties(pro);
        return pagehelper;
    }
}
