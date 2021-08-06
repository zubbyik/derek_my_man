package arc.local;

public interface SummerVisit {
    String visit();
}


class CanVisit implements SummerVisit {
    public String visit(){
    return "this house can be visited";
    }
}

class CannotVisit implements SummerVisit {
    public String visit(){
        return "this house cannot be visited";
    }
}