package maps_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

  public static void main(String[] args) {
    Product eBike = new Product("E-Bike", "A Bike that works with battery");
    Product roadBike = new Product("Road Bike", "A bike for competition");

    Map<String, Product> productsByName = new HashMap<>();

    productsByName.put(eBike.getName(),eBike);
    productsByName.put(roadBike.getName(),roadBike);

    System.out.println(productsByName);

    // We can retrieve a value from the map by its key
    // System.out.println(productsByName.get("E-Bike").toString());

    // System.out.println(productsByName.get("Car")); // null

    // Null as a Key
    Product defaultProduct = new Product("Chocolate", "At least have some chocolate");
    Product anotherDefaultProduct = new Product("Cakes", "how about getting some sweet cake");
    productsByName.put(null, defaultProduct);

    // Adding another value with the same Key ? replacing the value associated with that key.
   // productsByName.put(null, anotherDefaultProduct);


    // Adding the same value with different key:
    productsByName.put(defaultProduct.getName(), defaultProduct);


    // Remove a value:

    productsByName.remove("E-Bike");



    // Check if Key or Value Exists in the Map:

    // System.out.println(productsByName.containsKey("Chocolate")); // true

   // System.out.println(productsByName.containsValue(eBike)); // false

    // Iterating over a HashMap

    // iterate over the set of keys :
    /*
    for (String key: productsByName.keySet()) {
      Product p = productsByName.get(key);
      System.out.println(key+ " = "+ p.toString());
    } */

    // iterate over the set of values :
    /*
    ArrayList<Product> valueList = new ArrayList<>(productsByName.values());
    for (Product p:valueList) {
      System.out.println(p.toString());
    } */

    // iterate over the set of all entries :
    /*
    for (Map.Entry<String, Product> entry: productsByName.entrySet() ) {
      // get the key :
      String key = entry.getKey();
      //get the value:
      Product value = entry.getValue();
      // do something with key and value
      System.out.println(key+ " = "+ value.toString());
    }
*/


  }
}
