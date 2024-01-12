package com.prototype;

public class Demo 
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
	 BookShop bs=new BookShop();
	 bs.setShopname("Kitaabghar");
	 //bs.getBooks().remove(2);
	 bs.loadData();
	 
	 BookShop bs1=new BookShop();
	 bs.getBooks().remove(3);
	 bs1.setShopname("Rajendra Book Depot");
	 bs1.loadData();
	 
	 System.out.println(bs);
	 System.out.println(bs1);

	}

}
