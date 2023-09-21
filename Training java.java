import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Main {
    public static void main(String[] args) {
        String databaseName = "dbName";
        String databaseUrl = Database.getDatabase(databaseName);

        try (
                //Connexion de la bdd
                Connection conn = DriverManager.getConnection(databaseUrl);
                Statement stmt = conn.createStatement();
        ) {
            //Result success
            System.out.println("Database connected successfully...");

        } catch (SQLException e) {
            //Result failed
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}

class Database {
    public static String getDatabase(String databaseName) {
        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://hostname:1433;databaseName=" + databaseName;
        String login = "user=sa;password=pass;";

        String database = driverName + ";" + url + ";" + login;
        //retourne
        return database;
    }
}
