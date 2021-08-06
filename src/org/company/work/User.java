package org.company.work;

public class User {
String name;
String email;
String password;
DatabaseDeleter databaseDeleter;

    public User(String name, String email, String password, DatabaseDeleter databaseDeleter) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.databaseDeleter = databaseDeleter;
    }


    public void displayStatus(){
        System.out.printf("This new Employee is an %s and his name is %s, email is %s and password is %s and %s", getClass().getSimpleName(), this.name, this.email, this.password, this.databaseDeleter.deleteDatabase());
    }

}
