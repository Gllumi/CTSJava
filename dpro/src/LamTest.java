

import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LamTest
 */
@WebServlet("/LamTest")
public class LamTest extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public LamTest() {
        super();
        // TODO Auto-generated constructor stub
    }
    
   
   
	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Predicate <Integer>p =x-> {if(x%2==0) {
									System.out.println("even");}
								else {
									System.out.println("odd");
								}
						return true;
							};
		p.test(22);
		Function <Integer,Double>f=x->3.14*x*x;
		System.out.println(f.apply(5));
		
		BiFunction <Integer,Integer,Integer> b= (x,y) -> {
			if(x>y) {
			 return x;}
		    else {
			 return y;}
		     };
		     
		System.out.println(b.apply(54, 53)); 
		
		
		
	}

}


