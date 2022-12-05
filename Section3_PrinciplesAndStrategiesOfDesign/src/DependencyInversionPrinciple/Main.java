package DependencyInversionPrinciple;

interface DBConnectionInterface {
    public int connect();
}

class MySqlConnection implements DBConnectionInterface {
    public int connnect() {
        return 1;
    }
}

class PasswordReminder {
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}