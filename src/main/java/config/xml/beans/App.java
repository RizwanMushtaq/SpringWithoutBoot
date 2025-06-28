package config.xml.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("xml Main started");
    ApplicationContext context = new ClassPathXmlApplicationContext("config/xml/beans/config.xml");
  }
}
