package com.adham;

/*
 * @created 23/12/2020 - 17:16
 * @author  Adham eldda
 * @package com.adham
 * @project lambda
 */
public class RunnableExample {

  public static void main(String[] args) {

    Thread thread =  new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Printed inside Runnable");
      }
    });

   Thread thread1 = new Thread(()-> System.out.println("Second thread"));

   thread.run();
   thread1.start();
  }
}
