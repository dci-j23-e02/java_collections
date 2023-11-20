package maps_extra;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    // in Map collection the "Key" must be unique

    // HashMap doesn't maintain any order for the items "<Key, Value> pairs".
    // HashMap will generate the hashcode based on the "Key"
    HashMap<String, Car> carsHashMap = new HashMap<>();

    // TreeMap maintains accessing order for the items based on the "Keys"
    TreeMap<Integer, Car> carsTreeMap = new TreeMap<>();


    Car c1 = new Car("red", 50, "BMW");
    Car c2 = new Car("blue", 30, "VW");
    Car c3 = new Car("black", 25, "BMW");
    Car c4 = new Car("blue", 10, "Ford");
    Car c5 = new Car("gold", 100, "BMW");

    carsHashMap.put(c1.getColor(), c1);
    carsHashMap.put(c2.getColor(), c2);
    carsHashMap.put("no color", c2);
    carsHashMap.put(c3.getColor(), c3);
    carsHashMap.put(c4.getColor(), c4);
    carsHashMap.put(c5.getColor(), c5);

 //   System.out.println(carsHashMap);


    // integer key
    carsTreeMap.put(25, c1);
    carsTreeMap.put(14, c2);
    carsTreeMap.put(5, c2);
    carsTreeMap.put(5, c2);
    carsTreeMap.put(30, c3);
    carsTreeMap.put(11, c4);
    carsTreeMap.put(8, c5);

    System.out.println(carsTreeMap);




  }
}
