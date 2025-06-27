package com.rizwan.withoutboot.beans;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
  public void createOrder() {
    System.out.println("Order created successfully!");
  }
}
