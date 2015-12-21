package leetcode;
import java.sql.* ;  // for standard JDBC programs
import java.util.*;
import java.math.* ; // for BigDecimal and BigInteger support
// three forms of DriverManager.getConnection() method to create a connection object.

public class JDBC_example {
	private Object userName;
	private Object password;
	private String dbms;
	private String serverName;
	private String portNumber;
	
	String URL = "jdbc:oracle:thin:@amrood:1521:EMP";
	String USER = "username";
	String PASS = "password";
	Connection conn = DriverManager.getConnection(URL, USER, PASS);

	public Connection getConnection() throws SQLException {
	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    connectionProps.put("user", this.userName);
	    connectionProps.put("password", this.password);
	    
	        conn = DriverManager.getConnection(
	                   "jdbc:" + this.dbms + "://" +
	                   this.serverName +
	                   ":" + this.portNumber + "/",
	                   connectionProps);
	    
	    System.out.println("Connected to database");
	    return conn;
	}
}
