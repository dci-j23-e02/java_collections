package maps_collection;

import java.util.List;

public class Product {
private String name;
private String description;
private List<String> tags;

  public Product(String name, String description) {
    this.name = name;
    this.description = description;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", tags=" + tags +
        '}';
  }

// method

  public  Product addTagsOfOtherProduct(Product otherProduct){
    this.tags.addAll(otherProduct.getTags());
    return this;
  }



}
