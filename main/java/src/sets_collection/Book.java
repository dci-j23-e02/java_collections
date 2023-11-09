package sets_collection;

public class Book implements  Comparable<Book> {
    private String  title;
    private double price;

  public Book(String title, double price) {
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double newPrice) {
    if(newPrice >= 0 ){
      this.price = newPrice;
    }else{
      this.price = this.price;
    }
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", price=" + price +
        '}';
  }

  /**
   * Which java classes has implemented the Comparable<T> interface ?
   * Many of them , here are some of them :
   * 1. String
   * 2. Integer "e.g. not int"
   * 3. Double
   * 4. Float
   * 5. Long
   * 6. Short
   * 7. Byte
   * 8. Character
   * 9. BigInteger
   * 10. BigDecimal
   * 11. File
   * 12. URL
   * 13. Date
   * 14. LocalDate
   * 15. LocalDateTime
   * 16. LocalTime
   * 17. Instant
   *
   * */

  /**
   * This method @return  -1, 0, or 1 to decide if 'this' Book object is less , equal or greater than the 'other'
   * */

  @Override
  public int compareTo(Book other) {

  // return this.title.compareTo(other.title);
    if(other == null ) return 1;
    if(this == null) return -1;
    if(this.price < other.price){
      return -1;
    }else if(this.price == other.price){
      return this.title.compareTo(other.title);
    } else {
      return 1;
    }

  }
}
