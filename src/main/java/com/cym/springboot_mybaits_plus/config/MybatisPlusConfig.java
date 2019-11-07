package com.cym.springboot_mybaits_plus.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建 MybatisPlusConfig 类，指定 Mapper 地址，启用分页功能。
 *
 * @author wafer
 * @version 0.0.0
 * @date 2019-11-07 16:25
 */

@Configuration
@MapperScan("com.cym.springboot_mybaits_plus.mapper")
public class MybatisPlusConfig {

  /**
   * 分页插件
   */
  @Bean
  public PaginationInterceptor paginationInterceptor() {
    PaginationInterceptor page = new PaginationInterceptor();
    page.setDialectType("mysql");
    return page;
  }
}
