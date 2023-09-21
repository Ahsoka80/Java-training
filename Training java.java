import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Class Main
class Main {
        //Récupération de la variable database dans la class Database et dans la méthode.
        String database1 = Database.getDatabase();
	public static void main(String[] args) {

        try (   
                //Connection à la bdd
                Connection conn = DriverManager.getConnection(database1);
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
                //Affichage console résultat
                System.out.println("Database not created...");
            }

	}

}

class Database{

    //Méthode pour la connexion de la base de données. 
    public static void getDatabase(String database){

        String name = "com.microsoft.jdbc.sqlserver.SQLServerDriver"; 
        String url = "jdbc:microsoft:sqlserver://hostname:1433;";
        String login = "user=sa;password=pass;DatabaseName=dbName";

        database = name + url + login ;
    }
}
//Statement Object sert à executer une requête SQL