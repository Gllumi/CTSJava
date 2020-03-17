package utilities;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
public class DBHandler {
	public static Connection establishConnection() throws ClassNotFoundException, IOException{
		Connection con = null;
		FileInputStream fis = new FileInputStream("d://db.properties");
		Properties properties = new Properties();
		properties.load(fis);
		try {
			String dname = (String) properties.get("dname");
			String url = (String) properties.get("url");
			String username = (String) properties.get("uname");
			String password = (String) properties.get("pwd");
			
			Class.forName(dname);
			con = DriverManager.getConnection(url,username,password);
			if(con!=null) {
				System.out.println("Connection is established");
			}
			else {
				System.out.println("Connection not established");
			}
		}
		catch(SQLException e) {
			
		}
		return con;
	}
}
