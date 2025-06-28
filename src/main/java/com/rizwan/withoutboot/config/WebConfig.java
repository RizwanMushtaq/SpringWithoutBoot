package com.rizwan.withoutboot.config;

import com.rizwan.withoutboot.web.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
  // declare the HomeController bean
  @Bean(name = "homeController")
  public HomeController homeController() {
    return new HomeController();
  }
}
