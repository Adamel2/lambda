package com.adham;

import java.text.Format;

/*
 * @created 23/12/2020 - 16:58
 * @author  Adham eldda
 * @package com.adham
 * @project lambda
 */
public class TypeInferenceExample {

  public static void main(String [] args){

    printLambda(s -> s.length());



  }

  public static void printLambda(StringLengthLambda str){

    System.out.println(str.getLength("Hello World!"));
  }

  interface StringLengthLambda{

    int getLength(String str);

  }
}
