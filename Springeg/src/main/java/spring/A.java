package spring;

public class A {
	String fn;
	B b;
	A(){System.out.println("a is created");}
	
	public B getB() {
		return b;
	}
	public String getFullname() {
		return fn;
	}
	public void setFullname(String fn) {
		this.fn=fn;
	}
	public void setB(B b) {
		this.b=b;
	}
	void print() {System.out.println("hello two"+fn);}
	void display() {
		print();
		b.print();
	}
}
