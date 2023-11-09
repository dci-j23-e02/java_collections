package sets_collection;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Book book1 = new Book("java", 15);
    // book1.price = 20;
    book1.setPrice(-20);
    // System.out.println( book1.price);
    System.out.println(book1.getPrice());
  }
}
