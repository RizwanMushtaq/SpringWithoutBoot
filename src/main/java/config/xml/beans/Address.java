package config.xml.beans;

public class Address {
  String city;
  String state;

  public Address() {
    System.out.println("Address constructor called");
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Address{" +
        "city='" + city + '\'' +
        ", state='" + state + '\'' +
        '}';
  }
}
