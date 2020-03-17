package bookmain;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.BookDAO;
import dto.Book;
public class BookTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BookDAO b = new BookDAO("jdbc:mysql://localhost:3306/cts", "root","root");
		b.connect();
		Book book = new Book(1002,"Basic Concept Of C++","Lynda",4650);
		int ch = 0;
		
		System.out.println("1.Insert Book");
		System.out.println("2.Update Book");
		System.out.println("3.Delete Book");
		System.out.println("4.Show All Book");
		System.out.println("5.Exit");
		Scanner sc = new Scanner(System.in);
		ch=sc.nextInt();
		switch (ch) {
		case 1:b.insertBook(book);
				System.out.println("Book Inserted");
				break;
		case 2:b.updateBook(book);
				System.out.println("Book Updated");
				break;
		case 3:b.deleteBook(book);
				System.out.println("Book Deleted");
				break;
		case 4:
			List<Book> books = b.listAllBooks();
				for(Book p:books) {
					System.out.println(p.getTitle()+ "  -BY- "+p.getAuthor());
				}
				break;
		case 5: System.exit(0);		
		default : System.out.println("Wrong Entry");
		}
				
		
		
	}

}
