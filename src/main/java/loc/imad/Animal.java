package main.java.loc.imad;

public class Animal {
    String name;
    String classification;
    String locationFound;
    String animalType;
    Flys flyType;
    EatingHabit eatingHabit;

    Animal(String name, String classification, String locationFound, String animalType) {
        this.name = name;
        this.classification = classification;
        this.locationFound = locationFound;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public String getClassification() {
        return classification;
    }

    public String getLocationFound() {
        return locationFound;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String canIFly(Flys flyType){
        return flyType.fly();
    }

    public String canIEatMeat(EatingHabit eatingHabit){
        return eatingHabit.eatMeat();
    }
}
