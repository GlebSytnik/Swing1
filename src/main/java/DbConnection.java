import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gym1?serverTimezone=UTC";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";
    public  static final String GET_COACH = "SELECT * FROM coach";
    public DbConnection(){

    }
    public static   Connection getConnection() throws SQLException {
         Connection  connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
         return connection;
    }
}
