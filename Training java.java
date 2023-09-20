import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Class DATABASE
public class Database{
    //Méthode pour la connexion de la base de données. 
    public static getDatabase(){

        String name = "com.microsoft.jdbc.sqlserver.SQLServerDriver"; 
        String url = "jdbc:microsoft:sqlserver://hostname:1433;";
        String login = "user=sa;password=pass;DatabaseName=dbName";

        String database = name + url + login ;
    }
}

public class Main {

	public static void main(String[] args) {

        //Récupération de la variable database dans la class Database et dans la méthode.
        String database = Database.getDatabase();

        try (   
                //Connection à la bdd
                Connection conn = DriverManager.getConnection(getDatabase(database)); 
                //Exécution à la connexion à la base de données et création statement. 
                Statement stmt = conn.createStatement();
            ){ 
                //Requête SQL
                String sql = "CREATE DATABASE STUDENTS";
                //Execution de la Requête. 
                stmt.executeUpdate(sql);
                //Affichage console résultat
                System.out.println("Database created successfully...");

            } catch (Exception e) {

                System.out.println("Database not created...");
            }

	}

}



//Statement Object sert à executer une requête SQL