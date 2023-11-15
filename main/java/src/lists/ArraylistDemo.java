package lists;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

  public static void main(String[] args) {


    List<String> cars = new ArrayList<>();
    // ArrayList is a dynamic array : size can expand and shrink without any limitations
    // Add items

    cars.add("Volvo"); // index: 0
    cars.add("BMW"); // index: 1
    cars.add("Ford"); // index:2
    cars.add("Alpha"); // index:3


    // Access items
    // access item at index 2
    // System.out.println(cars.get(2));

    // Set items
    cars.set(3, "Opel");
   // System.out.println(cars);


    // Remove item
   // cars.remove("Ford");
   // cars.remove(0);

    // Clear all items
  //  System.out.println(cars);
   // cars.clear();
   // System.out.println(cars);

    // ArrayList size
   // System.out.println(cars.size());

    // Loop / iterate over the ArrayList

    // for i
    /*
    int indexOfFord = 0;
    String variable = null;
    for (int i = 0; i < cars.size(); i++) {
      variable = cars.get(i);
      // if(variable.equals("Ford")) // case sensitive
      if(variable.equalsIgnoreCase("ford")){
        indexOfFord = i;
        break;
      }
    } */

    // for-each

    List<Car> mycars = new ArrayList<>();
    Car c1 = new Car("Volvo", "red");
    Car c2 = new Car("Volvo", "blue");
    Car c3 = new Car("Volvo", "black");
    Car c4 = new Car("Volvo", "gold");
    mycars.add(c1);
    mycars.add(c2);
    mycars.add(c3);
    mycars.add(c4);

    for (Car value: mycars) {
      if(value.getColor().equalsIgnoreCase("gold") ){
        System.out.println("gold Volvo is available in Hamburg !! ");

      }else if(value.getColor().equalsIgnoreCase("red")){
        System.out.println("red Volvo is available in Berlin !! ");
      }else if(value.getColor().equalsIgnoreCase("blue")){
        System.out.println("blue Volvo is available in Dortmund !! ");
      }else {
        System.out.println("black Volvo is Out of stock !!!");
      }
    }


    //System.out.println(indexOfFord);



  }
}
