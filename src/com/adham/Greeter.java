package com.adham;

/*
 * @created 23/12/2020 - 15:56
 * @author  Adham eldda
 * @package com.adham
 * @project lambda
 */
public class Greeter {

  public void greet(Greeting greeting){

    greeting.perform();
  }

  public static void main(String [] args){

    Greeter greeter =  new Greeter();
    Greeting helloWorldGreeting =  new HelloWorldGreeting();


    Greeting greeting = ()-> System.out.println("I am a lambda");

    Greeting innerClass = new Greeting() {
      @Override
      public void perform() {
        System.out.println("Hello inner class");
      }
    };

    greeter.greet(greeting);
    greeter.greet(innerClass);


  }
}
