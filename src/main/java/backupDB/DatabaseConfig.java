package backupDB;

public class DatabaseConfig {
    private String dbname;
    private String user;
    private String password;

    public DatabaseConfig(String dbname, String user, String password) {
        this.dbname = dbname;
        this.user = user;
        this.password = password;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
