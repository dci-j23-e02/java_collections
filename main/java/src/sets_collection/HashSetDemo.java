package sets_collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

  public static void main(String[] args) {
    Set<String> ySet;
    ySet= new HashSet<String>();
    ySet.add("C");
    ySet.add("B");
    ySet.add("A");
    ySet.add("B");

    HashSet<Integer> newSet = new HashSet<Integer>();
    newSet.add(10); // hashcode(10) -> index in the hashtable
     newSet.add(25);
    newSet.add(2);
    newSet.add(100);


    Book b1 = new Book("C", 55.5);
    Book b2 = new Book("B", 100.5);
    Book b3 = new Book("A", 15.5);


    HashSet<Book> bookSet = new HashSet<>();
   // bookSet.add(b1);
    bookSet.add(b2);
    bookSet.add(b3);
    bookSet.add(b1);

    System.out.println(bookSet);

    // System.out.println(bookSet);


  }
}
