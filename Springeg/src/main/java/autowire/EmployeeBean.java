package autowire;

public class EmployeeBean {
	String fname;
	DepartmentBean dept; 
	public EmployeeBean( DepartmentBean dept) {
		super();
		
		this.dept = dept;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public DepartmentBean getDept() {
		return dept;
	}
	public void setDept(DepartmentBean dept) {
		this.dept = dept;
	}
	
}
