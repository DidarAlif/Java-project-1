package classes;
import java.lang.*;
import interfaces.*;

public class BookShop implements BookOperations
{

	private String bsId;
	private String name;
	private Book books[ ] = new Book[500];
	
	public BookShop()
	{
		System.out.println("Welcome To Insight BookShop");
	}
	public BookShop(String bsId, String name)//
	{
		System.out.println("Insight--BookShop");
		this.bsId = bsId;
		this.name = name;

	}
	public void setBsId(String bsId){this.bsId = bsId;}
	public void setName(String name){this.name = name;}

	
	public String getBsId(){return bsId;}
	public String getName(){return name;}


	
	/*public void showDetails()
	{
		System.out.println("BookShop  Id: " + bsId);
		System.out.println("BookShop Name: " + name);
	}*/
	public boolean insertBook(Book b)
	{
		boolean flag = false;
		for(int i = 0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				books[i] = b;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeBook(Book b) 
	{
		boolean flag = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == b)
			{
				books[i] = null;
				flag = true;
				break;
			}
		}
		return flag;		
	}
	public void showAllBooks()
	{
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				books[i].showDetails();
				System.out.println();
			}
			
		}
	}
	public Book searchBook(String isbn)
	{
		Book flag = null;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				if(books[i].getIsbn() == isbn)
				{
					flag = books[i];
					break;
				}
			}
		}
		return flag;
	}
	
}