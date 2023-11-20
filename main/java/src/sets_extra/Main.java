package sets_extra;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    Product p1 = new Product("Pen", 5, "Tools");
    Product p2 = new Product("Ball", 1, "Toys");
    Product p3 = new Product("Glass", 2, "Tools");
    Product p4 = new Product("Tray", 0, "Utilities");
    Product p5 = new Product("Tray", 1, "Tools" );

  // TreeSet Demo :

    TreeSet<Product> productsTreeSet = new TreeSet<>();

    // Add items
    productsTreeSet.add(p4);
    productsTreeSet.add(p2);
    productsTreeSet.add(p1);
    productsTreeSet.add(p3);
    productsTreeSet.add(p5);
   // productsTreeSet.add(p1);


   // System.out.println(productsTreeSet);

    HashSet<Product> productHashSet = new HashSet<>();

    productHashSet.add(p1);
    productHashSet.add(p2);
    productHashSet.add(p1);
    productHashSet.add(p1);
    productHashSet.add(p3);
    productHashSet.add(p4);

    System.out.println(productHashSet);




  }
}
