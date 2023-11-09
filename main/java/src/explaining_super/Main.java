package explaining_super;

public class Main {

  public static void main(String[] args) {
    Animal cow = new Animal("Cow", 4, false);
    Animal a1 = new Animal("Frog", 3, false);
    Animal cat = new Animal();



   // System.out.println(cow.getName());
   // System.out.println(cat.getName());
    cat.setName("Tom");
    cat.setNumOfLegs(4);
    cat.setEatMeat(true);
   // System.out.println(cat.getName());
   // System.out.println(cow.describe());

    Bird canary = new Bird("Willy", 2, false, "Coco", true);
    //System.out.println(canary.describe());
    //System.out.println(cat.describe());

    if(canary.isCanFly()){
      System.out.println(canary.getName()+" Can fly");
    }else{
      System.out.println(canary.getName()+" Can not fly");
    }

    if(canary.isEatMeat()){
      System.out.println(canary.getName()+" Eats meat");
    }else{
      System.out.println(canary.getName()+" Doesn't eat meat");
    }

    /*if(cow.getNumOfLegs() < 3){
      System.out.println("The animal "+ cow.getName()+" is not a Bird");
    }else if(cow.getNumOfLegs() == 4){
      System.out.println("The animal "+ cow.getName()+" is an Animal");
    }else{
      System.out.println("The animal "+ cow.getName()+" is a Monster");
    }*/

/*
    if(a1.getNumOfLegs() < 3){
      System.out.println("The animal "+ a1.getName()+" is not a Bird");
    }else if(a1.getNumOfLegs() == 4){
      System.out.println("The animal "+ a1.getName()+" is an Animal");
    }else{
      System.out.println("The animal "+ a1.getName()+" is a Monster");
    }*/

    animalLegsChecker(cow);
    animalLegsChecker(a1);
    animalLegsChecker(canary);
  }

  public static void animalLegsChecker(Animal x){
    if(x.getNumOfLegs() < 3){
      System.out.println("The Animal "+ x.getName()+" is a Bird");
    }else if(x.getNumOfLegs() == 4){
      System.out.println("The Animal "+ x.getName()+" is an Animal");
    }else{
      System.out.println("The Animal "+ x.getName()+" is a Monster");
    }
  }

}
