package com.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dailongwen
 *
 */
@SpringBootApplication
@MapperScan("com.cn.article.mapper")
public class MyApplication {

  public static void main(String[] args) {
    SpringApplication.run(MyApplication.class, args);
    
  }
}
