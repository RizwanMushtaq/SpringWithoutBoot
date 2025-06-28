package com.rizwan.withoutboot;

import another.world.Repo;
import another.world.RepoConfig;
import com.rizwan.withoutboot.beans.CartService;
import com.rizwan.withoutboot.beans.OrderService;
import com.rizwan.withoutboot.beans.UserService;
import com.rizwan.withoutboot.config.AppConfig;
import com.rizwan.withoutboot.web.AuthController;
import com.rizwan.withoutboot.web.HomeController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    // We have to create object of Application Context
    // using AnnotationConfigApplicationContext for annotations configuration
    ApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class, RepoConfig.class);
    //this could be used for xml based configuration
    // ApplicationContext context = new ClassPathXmlApplicationContext();
    System.out.println(context);
    CartService cartService = context.getBean("cartService1", CartService.class);
    cartService.createCart();
    UserService userService = context.getBean(UserService.class);
    userService.saveUser();
    OrderService orderService = context.getBean(OrderService.class);
    orderService.createOrder();
    HomeController homeController = context.getBean("homeController", HomeController.class);
    homeController.homePage();
    AuthController authController = context.getBean("authController", AuthController.class);
    authController.login();
    Repo repo = context.getBean("repo", Repo.class);
  }
}
