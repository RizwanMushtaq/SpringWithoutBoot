package com.rizwan.withoutboot.config;

import com.rizwan.withoutboot.web.AuthController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {
  @Bean(name = "authController")
  public AuthController authController() {
    return new AuthController();
  }
}
