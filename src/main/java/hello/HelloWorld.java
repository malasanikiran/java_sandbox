package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());

    System.out.println(greeter.sayBye());
  }

  public String reverseString(String in) {
    return new StringBuilder().append(in).reverse().toString();
  }
}
