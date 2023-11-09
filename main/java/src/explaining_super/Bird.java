package explaining_super;

public class Bird extends Animal{
  // Fields
  private String voice;
  private boolean canFly;

  // Constructor
  public Bird(String name, Integer numOfLegs,boolean eatMeat, String voice, boolean canFly) {

    // the constructor on Animal class
    super(name, numOfLegs, eatMeat);

    //other Bird fields, to be constructed by Bird constructor
    this.voice = voice;
    this.canFly = canFly;
  }


  // Getters and Setters


  public String getVoice() {
    return voice;
  }

  public void setVoice(String voice) {
    this.voice = voice;
  }

  public boolean isCanFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  // Override describe method
  @Override
  public String describe(){
    return "The Animal "+ getName() +" has "+ getNumOfLegs() +
        " legs, and it can eat meat "+eatMeat+" and can fly "
        +canFly +" and its voice is "+voice+ " and is considered Bird.";
  }


}
