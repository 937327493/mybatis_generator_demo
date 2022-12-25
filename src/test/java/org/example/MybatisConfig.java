package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "cn.wangziwei.mybatis.mapper")
public class MybatisConfig {

}
