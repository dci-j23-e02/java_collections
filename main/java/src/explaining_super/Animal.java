package explaining_super;

public class Animal {
  // Fields
   private String name ;
   private Integer numOfLegs ;
   protected boolean eatMeat ;

  // Constructor

  public Animal(String name, Integer numOfLegs, boolean eatMeat ) {
    this.name = name;
    this.numOfLegs = numOfLegs;
    this.eatMeat = eatMeat;
  }

  public Animal(Integer numOfLegs) {

    this.numOfLegs = numOfLegs;
  }



  public Animal(String name) {
    this.name = name;

  }

  public Animal() {
      }


 // Getters and Setters methods
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getNumOfLegs() {
    return numOfLegs;
  }

  public void setNumOfLegs(Integer numOfLegs) {
    this.numOfLegs = numOfLegs;
  }

  public boolean isEatMeat() {
    return eatMeat;
  }

  public void setEatMeat(boolean eatMeat) {
    this.eatMeat = eatMeat;
  }

  // features methods
  public String describe(){
    return "The Animal "+ name+" has "+numOfLegs+" legs, and it can eat meat "+eatMeat+" and is considered Animal.";
  }


}
