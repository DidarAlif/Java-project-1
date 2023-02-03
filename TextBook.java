package classes;
import java.lang.*;

public class TextBook extends Book
{
	private int standard;
	
	public TextBook()
	{
		super();
		System.out.println("Tt-B");
	}
	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,int standard)
	{
		super(isbn,bookTitle,authorName,price,availableQuantity);
		System.out.println("Tt-B");
		this.standard = standard;
	}
	
	public void setStandard(int standard){this.standard = standard;}
	public int getStandard(){return standard;}
	
	public void showDetails()
	{
		System.out.println("Isbn: "+ isbn);
		System.out.println("BookTitle: "+ bookTitle);
		System.out.println("AuthorName: "+ authorName);
		System.out.println("Price: "+ price);
		System.out.println("AvailableQuantity: "+ availableQuantity);
		System.out.println("Standard : "+ standard);
	}
}