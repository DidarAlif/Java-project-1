package classes;
import java.lang.*;
import interfaces.*;

public class Publication implements BookShopOperations, EmployeeOperations
{
	private BookShop bookShops[] = new BookShop [50];
	private Employee employees[] = new Employee [150];
	
	public boolean insertBookShop(BookShop bs)
	{
		boolean flag = false;
		for(int i=0; i<bookShops.length; i++)
		{
			if(bookShops[i] == null)
			{
				bookShops[i] = bs;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeBookShop(BookShop bs)
	{
		boolean flag = false;
		for(int i=0; i<bookShops.length; i++)
		{
			if(bookShops[i] == bs)
			{
				bookShops[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public BookShop searchBookShop(String bsId)
	{
		BookShop bs = null;
		
		for(int i=0; i<bookShops.length; i++)
		{
			if(bookShops[i] != null)
			{
				if(bookShops[i].getBsId().equals(bsId))
				{
					bs = bookShops[i];
					break;
				}
			}
		}
		return bs;
	}
	public void showAllBookShops()
	{	
		for(int i=0; i<bookShops.length; i++)
		{
			if(bookShops[i] != null)
			{
				System.out.println("*************************************************");
				System.out.println("BookShop ID : "+bookShops[i].getBsId());
				System.out.println("BookShop Name : "+bookShops[i].getName());
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
				bookShops[i].showAllBooks();
				System.out.println();
			}
		}
	}
		
	public boolean insertEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}   
		return flag;
	}

	public Employee searchEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)   
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	public void showAllEmployees()
	{
		System.out.println("++++++++++++++++++++++");
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				System.out.println("\n---------------------------------------------------\n");
				System.out.println("Employee Id: " + employees[i].getEmpId());
				System.out.println("Employee Name: " + employees[i].getName());
				System.out.println("Employee Salary: " + employees[i].getSalary());
				System.out.println("Employee Nid: " + employees[i].getNid());
				System.out.println("\n---------------------------------------------------\n");
			}
		}
	}
}
