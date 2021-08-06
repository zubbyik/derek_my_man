package org.company.work;

public interface DatabaseDeleter {
    String deleteDatabase();
}


class CanDeleteDatabase implements DatabaseDeleter{
    @Override
    public String deleteDatabase() {
        return "he can delete database";
    }
}

class CannotDeleteDatabase implements DatabaseDeleter{
    @Override
    public String deleteDatabase() {
       return "he cannot delete database";
    }
}
