package bll;

import java.util.List;
import dto.Book;

public interface BookBLL {

		public List<Book> listAllBooks() ;
		
		public Book getBook(int id) ;
		
		public void deleteBook(int id); 
		
		public void updateBook(Book Book);
	
}
