package com.rizwan.withoutboot.config;

import com.rizwan.withoutboot.beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.rizwan.withoutboot")
public class AppConfig {
  // bean for CartService
  @Bean(name = "cartService1")
  public CartService cartService() {
    return new CartService();
  }
}
