package arc.local;

public class HouseDisplay {
    public static void main(String[] args) {
        Parliarment parliarment = new Parliarment(120, 44, new CannotVisit());
        parliarment.displayHouse();
    }
}
