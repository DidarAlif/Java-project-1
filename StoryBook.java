package classes;
import java.lang.*;

public class StoryBook extends Book
{
	private String category;
	
	public StoryBook()
	{
		super();
		System.out.println("St-B");
	}
	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,String category)
	{
		super(isbn,bookTitle,authorName,price,availableQuantity);
		System.out.println("St-B");
		this.category = category;
	}
	
	public void setCategory(String category){this.category = category;}
	public String getCategory(){return category;}
	
	public void showDetails()
	{
		System.out.println("-------------------------------------------\n\n");
		System.out.println("Isbn: "+ isbn);
		System.out.println("BookTitle: "+ bookTitle);
		System.out.println("AuthorName: "+ authorName);
		System.out.println("Price: "+ price);
		System.out.println("AvailableQuantity: "+ availableQuantity);
		System.out.println("Category : "+ category);
		System.out.println("-------------------------------------------\n\n");

	}
}