package eventlisteners;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Your message:  "+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void showData() {
		System.out.println("This will show the string...");
	}
	
}
