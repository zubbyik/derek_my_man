package main.java.loc.imad;

public class Zoo {
    public static void main(String[] args) {
        Bird cukoo = new Bird("Cuckoo", "Bird", "Amazon", "Omnivorous");
        Dog sparky = new Dog("Sparky", "Dog", "Most Homes", "Omnivorous");
        System.out.printf("The name of this %s is %1s and it is located in the %3s and its of the Type %4s Animal and %s ",
                cukoo.classification, cukoo.name, cukoo.locationFound, cukoo.animalType, cukoo.canIFly(new CanFly()));

        System.out.printf("The name of this %s is %1s and it is located in the %3s and its of the Type %4s Animal and %s. Interestingly it %s  ",
                cukoo.classification, sparky.name, sparky.locationFound, sparky.animalType, sparky.canIFly(new CantFly()), sparky.canIEatMeat(new IcanEatMeat()));
    }
}
