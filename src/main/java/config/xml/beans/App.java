package config.xml.beans;

import another.world.Repo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("xml Main started");
    ApplicationContext context = new ClassPathXmlApplicationContext("config/xml/beans/config.xml");
    Student student = context.getBean("student1", Student.class);
    student.sayHello();
    System.out.println(student);
    Repo repo = context.getBean("repo", Repo.class);
    repo.getUser();
  }
}
