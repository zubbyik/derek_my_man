package org.company.work;

public class Admin extends User{
    public Admin(String name, String email, String password, DatabaseDeleter databaseDeleter) {
        super(name, email, password, databaseDeleter);
    }
}
