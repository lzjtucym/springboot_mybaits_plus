package com.cym.springboot_mybaits_plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.cym.springboot_mybaits_plus.mapper")
@EnableSwagger2
public class SpringbootMybaitsPlusApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootMybaitsPlusApplication.class, args);
  }

}
