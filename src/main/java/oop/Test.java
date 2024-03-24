package oop;

public class Test {
    public static void main(String[] args) {
        Breed frenchie = new Breed("French bulldog", "Crazy", "a lot");
        Breed persian = new Breed("Persian","Playfull","no");
        Breed eclectus = new Breed("eclectus","curious", "no");
        Address dogAddress1 = new Address("Bulgaria","Sofia",1000);
        Address catAddress1 = new Address("Bulgaria","Sofia",1421);
        Address parrotAddress1 = new Address("Bulgaria","Sliven", 8800);

        Dog morti = new Dog("Morti",(byte) 1,true, frenchie, dogAddress1, false);
        Cat sisa = new Cat("Sisa", (byte) 2, false, persian, catAddress1, true );
        Parrot coco = new Parrot("Coco",(byte)3,true, eclectus,parrotAddress1,"variegated",true);

        morti.printData();
        morti.eat();
        morti.bark();
        morti.play();
        morti.play("ball");
        System.out.println(" ");
        sisa.printData();
        sisa.eat();
        sisa.meow();
        System.out.println(" ");
        coco.printData();
        coco.eat();
        coco.eat("pineapple");
        coco.talk();
        coco.play();










    }
}
