package dao;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import data.Employee;
public class EmployeeDAO {
	public static Connection getConnection()  {
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		    con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/cts","root","root");
		
		}
		catch(Exception e) {
			
		}
		
		return con;
	}
	public int insertEmployee(Employee emp) {
		int result=0;
		try
		{
		Connection con=getConnection();
		String sql="insert into employee values(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, emp.getEname());
		pst.setString(2, emp.getId());
		
		pst.setString(3, emp.getDept());
		pst.setString(4, emp.getDesg());
		pst.setString(5, emp.getComp());
		pst.setString(6, emp.getEmail());
		result=pst.executeUpdate();
		}
		catch(Exception e)
		{

		}
		return result;

	}
	public List<Employee> showEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			Connection con=getConnection();
			Statement ps = con.createStatement();
			ResultSet rs=ps.executeQuery("Select * from employee");
			while(rs.next()) {
				Employee u=new Employee();
				u.setEname(rs.getString(1));
				u.setId(rs.getString(2));
				u.setDept(rs.getString(3));
				u.setDesg(rs.getString(4));
				u.setComp(rs.getString(5));
				u.setEmail(rs.getString(6));
				list.add(u);
			}
		}catch(Exception e) {}
		return list;
		
	}
	
	public Employee searchEmployee() {
		Employee emp = new Employee();
		try {
			Connection con = getConnection();
			
		}catch(Exception e) {
			
		}
		
		return null;
		
	}
	
}
