package arc.local;

public class House {
    int Doors;
    int Rooms;
    SummerVisit summerVisit;

    House(int Doors, int Rooms, SummerVisit summerVisit){
        this.Doors = Doors;
        this.Rooms = Rooms;
        this.summerVisit = summerVisit;
    }

    public String canIvit(){
        return this.summerVisit.visit();
    }
}
