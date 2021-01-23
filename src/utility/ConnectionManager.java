package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();	
		InputStream in =  ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}
	public static Connection getConnection() throws Exception,SQLException {
		Properties p = loadPropertiesFile(); //loadproperties returns properties.
		Class.forName(p.getProperty("driver")); //getting value in jdbc assigned to prop.why seperate file is db may change
		//create connection object
//		System.out.println(p.getProperty("driver"));
//		System.out.println(p.getProperty("url"));
//		Connection con= null;
		Connection con= DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
	
		if(con !=null) {
			System.out.println("Established");
		}
		else {
			System.out.println("Not connected");
		}
		return con;
		
		
	}
}
