package org.company.work;

public class Subscriber extends User{
    public Subscriber(String name, String email, String password, DatabaseDeleter databaseDeleter) {
        super(name, email, password, databaseDeleter);
    }
}
