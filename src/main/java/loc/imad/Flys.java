package main.java.loc.imad;

public interface Flys {
    public String fly();
}


class CanFly implements Flys{
    public String fly(){
        return "I can Fly";
    }
}

class CantFly implements Flys {
    public String fly(){
        return "I can't fly unfortunately";

    }
}