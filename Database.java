import java.sql.*;
import java.util.Properties;

public class Database
{
  public static final String HOST = "127.0.0.1";
  public static final String USER = "cinema";
  public static final String PASS = "cinema_pass";
  public static final String DB = "cinema";
  public static final String DB_CLASS_NAME = "com.mysql.jdbc.Driver";

  private Connection connection;

  public Database()
  {
    String connectionString = "jdbc:mysql://" + HOST + "/" + DB;

    try {
      Class.forName(DB_CLASS_NAME);
    }
    catch(ClassNotFoundException e) {
      System.out.println("Class not found: " + e.getMessage());
      System.exit(1);
    }

    Properties p = new Properties();
    p.put("user", USER);
    p.put("password", PASS);
    try {
      connection = DriverManager.getConnection(connectionString, p);
    }
    catch(SQLException e) {
      handleSqlException(e);
    }
  }

  public ResultSet execute(String sql)
  {
    ResultSet result = null;
    try {
      Statement statement = connection.createStatement();
      result = statement.executeQuery(sql);
    }
    catch(SQLException e) {
      handleSqlException(e);
    }
    return result;
  }

  public static void handleSqlException(SQLException e)
  {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
      System.exit(1);
  }

  /*
  public static void main(String[] args)
  {
    Database db = new Database();
    ResultSet result = db.execute("select * from test");

    try {
      while(result.next()) {
        int id = result.getInt("id");
        System.out.println("id: " + id);
      }
    }
    catch(SQLException e) {
      Database.handleSqlException(e);
    }
  }
  */
}
