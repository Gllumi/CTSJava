package spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentBean {
	Connection con;
	String qid;
	public StudentBean(String qid, String question, Map<String,String> answers) {
		super();
		this.qid = qid;
		this.question = question;
		this.answers = answers;
	}
	public String getQid() {
		return qid;
	}
	public void setQid(String qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String,String> answers) {
		this.answers = answers;
	}
	String question;
	Map<String, String> answers;
	String name;
	String id;
	String branch;
	College college;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void Stu() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(branch);
		System.out.println(college.cname+ "  "+college.university);
	}
	public StudentBean() {
		//Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			
			
		}catch(Exception e) {
			
		}
	}
	/*public void result() {
		try {
			ArrayList<String> ar = new ArrayList<String>();
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from students where HTNO = 'CTSJAVA01'");
			while(rs.next()) {
				id=rs.getString(1);
				name= rs.getString(2);
				branch=rs.getString(3);
				college=rs.getString(4);
				ar.add(id);
				ar.add(name);
				ar.add(branch);
				ar.add(college);
			}
			System.out.println(ar);
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}*/
	
	public void showAnswers() {
		System.out.println("QId: "+qid +"  Question: "+question);
		Set entries = answers.entrySet();
		Iterator itr =  entries.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			
			//String v = m1.getValue();
			System.out.println(m1.getKey()+ " -> " +m1.getValue());
	}
	}
	
}
