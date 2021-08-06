package main.java.loc.imad;

public interface EatingHabit {
    public String eatMeat();
}

class IcanEatMeat implements EatingHabit {
    @Override
    public String eatMeat() {
        return "I can eat meat";
    }
}

class ICantEatMeat implements EatingHabit{
    @Override
    public String eatMeat() {
        return "I cant Eat Meat";
    }
}
