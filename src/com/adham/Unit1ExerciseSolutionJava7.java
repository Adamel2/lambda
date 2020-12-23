package com.adham;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * @created 23/12/2020 - 17:34
 * @author  Adham eldda
 * @package com.adham
 * @project lambda
 */
public class Unit1ExerciseSolutionJava7 {

  public static void main(String[] args) {

    List<Person> people =
        Arrays.asList(
            new Person("Adham", "Jhon", 20),
            new Person("Ale", "Alex", 20),
            new Person("Vlad", "Jack", 20),
            new Person("Jhon", "Susan", 20),
            new Person("Sergey", "Alexi", 20));

    //Sort list

    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
      }
    });

    //print people list
    printAll(people);


    //print a people that have last name beginning with A

    printLastNameWithCondition(people, new Condition() {
      @Override
      public boolean test(Person p) {
        if (p.getLastName().startsWith("A")) return true;
        return false;
      }
    });

}

  private static void printLastNameWithCondition(List<Person> people ,Condition condition) {

    for (Person p : people ) {

      if (condition.test(p)) System.out.println(p);
    }

  }

  private static void printAll(List<Person> people) {

    for (Person p : people) System.out.println(p);
  }

  interface Condition{

    boolean test(Person p);
  }
}
