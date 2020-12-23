package com.adham;

/*
 * @created 23/12/2020 - 16:04
 * @author  Adham eldda
 * @package com.adham
 * @project lambda
 */
public class HelloWorldGreeting implements Greeting{
  @Override
  public void perform() {

    System.out.println("Hello World!");
  }
}
