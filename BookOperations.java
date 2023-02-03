package interfaces;
import java.lang.*;
import classes.Book;

public interface BookOperations
{
	boolean insertBook(Book b);
	boolean removeBook(Book b);
	void showAllBooks( );
	Book searchBook(String isbn);
}