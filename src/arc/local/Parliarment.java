package arc.local;

public class Parliarment extends House{
    Parliarment(int Doors, int Rooms, SummerVisit summerVisit){
        super(Doors, Rooms, summerVisit);
    }
    TypeOfHouse typeOfHouse = TypeOfHouse.CHATEU;
    public void displayHouse(){
        System.out.printf("The %s has %d Doors and %d Rooms and its building type can be called a %s and in the summer, %s", getClass().getSimpleName(), this.Doors, this.Rooms, typeOfHouse, this.canIvit());
    }

}
