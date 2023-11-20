package sets_extra;

public class Product implements Comparable<Product> {
private   String name;
private  double price;
private String category;

  public Product(String name, double price, String category) {
    this.name = name;
    this.price = price;
    this.category = category;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", category='" + category + '\'' +
        '}';
  }

/*
  * Params:
o – the object to be compared.
Returns:
a negative integer, zero, or a positive integer
* as this object is less than, equal to, or greater
*  than the specified object.
  * */


  @Override
  public int compareTo(Product otherProduct) {

    if(this.price < otherProduct.getPrice()){
      return -1;
    }else if(this.price == otherProduct.getPrice()){
      // if the prices are the same, compare on names
      if(  this.name.compareTo(otherProduct.getName()) < 0){
        return -1;
      }else if(this.name.compareTo(otherProduct.getName()) > 0 ){
        return 1;
      }else{
        return  this.category.compareTo(otherProduct.getCategory());
      }
    }else{
      return 1;
    }



    // return  this.name.compareTo(otherProduct.getName());
  }



}
