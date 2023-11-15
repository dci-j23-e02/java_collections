package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Alpha");

    //System.out.println(cars);
    //System.out.println(cars.size());

    // Add item to the first position :
    cars.addFirst("Mazda");
   // System.out.println(cars);
   // System.out.println(cars.size());

    // Add item to the last position :
    cars.addLast("Opel");
   // System.out.println(cars);
  //  System.out.println(cars.size());

    // Add item to a specified position :
    cars.add(2, "Mercedes");
   // System.out.println(cars);
   // System.out.println(cars.size());


    // Other useful methods
//cars.size()

    String[] newcars = {"smart", "Honda", "Nissan"};
    List<String> carList = List.of(newcars);
    // System.out.println(cars); // [Mazda, Volvo, Mercedes, BMW, Ford, Alpha, Opel]
   //  cars.addAll(carList);
   //  System.out.println(cars); // [Mazda, Volvo, Mercedes, BMW, Ford, Alpha, Opel, smart, Honda, Nissan]

    boolean found = cars.contains("Mercedes");
  //  System.out.println(found);
    System.out.println(cars.indexOf("Mercedes")); // 2
    System.out.println(cars.indexOf("Safwan")); // -1
    /**
     * removeFirst
     * removeLast
     * getFirst
     * getLast
     * */


  }


}
