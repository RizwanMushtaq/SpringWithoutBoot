package config.xml.beans;

public class Student {
  String name;
  int age;
  Address address;

  public Student() {
    System.out.println("Student constructor called");
  }

  public void sayHello() {
    System.out.println("Hello from Student");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", address=" + address +
        '}';
  }
}
