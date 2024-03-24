package oop;

public class Parrot extends Pet{

    private String color;
    private boolean isTalking;



    public Parrot(String name, byte age, boolean isMale, Breed breed, Address address,String color,boolean isTalking){
        super(name, age, isMale,breed,address);
        this.color = color;
        this.isTalking = isTalking;

    }

    public void talk(){
        System.out.printf("%s is talking..\n",super.getName());

    }

    public void eat(){
        System.out.println("Food always on time");

    }
public void eat(String fruit){
    System.out.println("Fruit 2-3 times a week");
    }

    public void play(){
        System.out.printf("%s is playing on the swing", super.getName());
    }

}
  