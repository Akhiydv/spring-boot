package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop 
{
	private String shopname;
	
	List<Book> books=new ArrayList<>();

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData() 
	{
		for(int i=1; i<=4; i++)
		{
			Book b=new Book();
			b.setBid(i);
			b.setBname("Book "+i);
			getBooks().add(b);
		}
	}

	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", books=" + books + "]";
	}
	
	

}
