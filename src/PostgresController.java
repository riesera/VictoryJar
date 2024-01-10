//Imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostgresController {

    //TODO: Have this be in a YAML File
    //Variables for connecting to the PostgreSQL server
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/UserInfo";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "password";

    private static Connection connection;

    //Setting up the connection
    static{
        try{

            //Register the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void addUser(String userName, String password, String email){

        try{

            //Connect to the database
            connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);

            //TODO: Add a hashing algorithm here, or probably another method for the password before passing
            String sql = "INSERT INTO user_accounts (userName, password, email);";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){

                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, password);
                preparedStatement.setString(3, email);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {

                if (connection != null) {

                    connection.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
