package sets_collection;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

  public static void main(String[] args) {
    Set<Book> setVar ; // TreeSet<String> x = new TreeSet<>();
    setVar =  new TreeSet<>();

    // add elements to TreeSet object
     Book b1 = new Book("C", 55.5);
     Book b2 = new Book("B", 100.5);
     Book b3 = new Book("A", 15.5);

    setVar.add(b1);
    setVar.add(b2);
    setVar.add(b3);
    setVar.add(null);

    /** TreeSet compare all items to each other , here is just an example :
     *  b1.compareTo(b2); // return -1 means  b1 is less than b2 // the set keeps b1 before b2
     *  b2.compareTo(b3); // return 1  means b2 is greater than b3 // the set order b2 to be after b3
     * */

    //System.out.println(setVar);




  }
}
