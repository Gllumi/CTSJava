package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dto.Accounts;
import dto.Users;
public class AccountDao {
    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
    
    public AccountDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
	public void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(
                                        jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
		
	
	public void disconnect() throws SQLException{
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
	}
	
	
	
	public void deposit(float amt,String accno) throws SQLException {
		connect();
		String sql="update Accounts Set balance = balance + ? where acno = '?'";
		
		PreparedStatement pst = jdbcConnection.prepareStatement(sql);
		pst.setFloat(1, amt);
		pst.setString(2, accno);
		int status = pst.executeUpdate();
		System.out.println("amount deposited");
		//pst.setFloat(1, account.setBalance(balance));
	}
	
	
	
	public void withdraw(Accounts account) {
		
	}
	public void getBalance(int acno) throws SQLException {
		connect();
		String sql="select balance from Account where acno= ?";
		Statement st = jdbcConnection.createStatement();
		ResultSet resultSet = st.executeQuery(sql);
		
		
	}
	public  int checkAccount(Accounts account) throws SQLException {
		 String sql = "SELECT * FROM Accounts";
         int flag=0;
        connect();
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
       	 String temp1 = resultSet.getString("acno");
       	/* String temp2 = resultSet.getString("name");
       	String temp3 = resultSet.getString("acktype");
       	String temp4 = resultSet.getString("balance");*/
       	 if(temp1.equals(account.getAccountNumber())){
       		 flag=1;
       		 break;
       	 }
       	 
        }
        
        resultSet.close();
        statement.close();
             	 	
   	return flag;
	}
}
