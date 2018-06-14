import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:postgresql://10.66.32.4:5107/postgres","postgres","123");
	}
}

//jdbc:postgresql://localhost:5432/postgres","postgres","0310vab"
//"jdbc:postgresql://10.66.32.4:5107/postgres","postgres","123"