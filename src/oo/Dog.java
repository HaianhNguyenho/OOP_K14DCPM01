package oo;
//implementation

public class Dog extends Animal implements Pet, IntName{

  public void makeNoise(){
    System.out.println("Making gau gau");
  }

  protected void eat(){
    System.out.println("Eating pone...");
  }

  public void protectHouse(){
    System.out.println("Protecting...");
  }
    public void chaseCat(){
      System.out.println("Chasing cat");
    }

    public void beFriendly(){

    }

    public void play(){

    }
    public void setName(String name){

    }

    public String getName(){

      return null;
    }

    
}
