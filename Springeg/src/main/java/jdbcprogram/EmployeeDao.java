package jdbcprogram;


import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate  jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}
	
	public int saveEmployee(Employee e) {
		String query ="insert into employee values('"+e.getEname()+"','"+e.getEid()+"','"+e.getDept()+"','"+e.getDesg()+"','"+e.getComp()+"','"+e.getEmail()+"')";  
		return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(Employee e) {
		String query ="delete from employee where id='"+e.getEid()+"'";  
		return jdbcTemplate.update(query);
	}
	
	public int updateEmployee(Employee e) {
		String query ="update employee SET name='"+e.getEname()+"',dept='"+e.getDept()+"', desg='"+e.getDesg()+"', company='"+e.getComp()+"', email='"+e.getEmail()+"' where id='"+e.getEid()+"'";  
		return jdbcTemplate.update(query);
	}
}
