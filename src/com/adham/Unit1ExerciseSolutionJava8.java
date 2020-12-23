package com.adham;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/*
 * @created 23/12/2020 - 17:56
 * @author  Adham eldda
 * @package com.adham
 * @project lambda
 */
public class Unit1ExerciseSolutionJava8 {


  public static void main(String[] args) {

    List<Person> people =
      Arrays.asList(
        new Person("Adham", "Jhon", 20),
        new Person("Ale", "Alex", 20),
        new Person("Vlad", "Jack", 20),
        new Person("Jhon", "Susan", 20),
        new Person("Sergey", "Alexi", 20));

    // Sort list

    System.out.println("Sorting....!");

    Collections.sort(people,(o1 ,o2) -> o1.getLastName().compareTo(o2.getLastName()));

    // print people list

    System.out.println("Printing....!");

    printLastNameWithCondition(people, p -> true);
//    printLastNameWithCondition(people , p -> !p.getLastName().isEmpty());

    // print a people that have last name beginning with A

    System.out.println("Condition....!");
    printLastNameWithCondition(people, p ->  p.getLastName().startsWith("A"));
  }

  private static void printLastNameWithCondition(List<Person> people , Predicate<Person> predicate) {

    for (Person p : people ) {

      if (predicate.test(p)) System.out.println(p);
    }

  }


}
