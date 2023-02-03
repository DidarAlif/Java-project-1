package interfaces;

import java.lang.*;
import classes.BookShop;

public interface BookShopOperations
{
	boolean insertBookShop(BookShop bs);
	boolean removeBookShop(BookShop bs);
	BookShop searchBookShop(String bsId);
	void showAllBookShops();

}