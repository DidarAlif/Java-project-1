package classes;
import java.lang.*;

import interfaces.BookQuantity;

public abstract class Book implements BookQuantity
{
	protected String isbn;
    protected String bookTitle;
	protected String authorName;
    protected double price;
	protected int availableQuantity;
	
	public Book(){System.out.println("Empty-Book");}
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		System.out.println("Parameterized-Book");
		this.isbn= isbn;
		this.bookTitle = bookTitle;
		this.authorName =authorName;
		this.price =price;
		this.availableQuantity=availableQuantity;

	}	
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName =authorName;
	}
	public void setPrice (double price)
	{
		this.price =price;
	}
	
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	
	
	public String getIsbn()
	{
		return isbn; 
	}
	public String getBookTitle()
	{
		return bookTitle; 
	}
	public String getAuthorName()
	{ 
		return authorName;
	}
	public double getPrice()
	{ 
		return price;
	}
	public int getAvailableQuantity()
	{ 
		return availableQuantity;
	}
	public boolean addQuantity(int amount){
		if(amount>0){

			System.out.println("-------------------------------------------\n\n");
			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("Added Amount: "+ amount);

			availableQuantity = availableQuantity+amount;
			
			System.out.println("Current Quantity: "+ availableQuantity);
			
			System.out.println("-------------------------------------------\n\n");
			return true;
		}
		else{return false;}
	}
    public boolean sellQuantity(int amount){

		if(amount>0 && amount<= availableQuantity){

			System.out.println("-------------------------------------------\n\n");
			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("Selled Amount: "+ amount);

			availableQuantity = availableQuantity-amount;
			
			System.out.println("Current Quantity: "+ availableQuantity);
			System.out.println("-------------------------------------------\n\n");
			
			return true;
		}
		else{return false;}
}
	
	public abstract void showDetails();
	
	
}