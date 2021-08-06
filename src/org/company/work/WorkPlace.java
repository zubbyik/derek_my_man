package org.company.work;

public class WorkPlace {
    public static void main(String[] args) {
        Admin mike = new Admin("Mike", "mike@imadconsulting.co.uk", "mikepass", new CanDeleteDatabase());
        mike.displayStatus();
    }
}
