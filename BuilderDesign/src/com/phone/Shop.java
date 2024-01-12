package com.phone;

public class Shop 
{
	public static void main(String args[])
	{
		//Phone p = new PhoneBuilder().setOs("Android").setRam(5).setProcessor("Qualcomm").setScreensize(5.5).setBattery(4000);
	
		Phone p=new PhoneBuilder().setOs("Android").setRam(5).setBattery(4000).getPhone();
		System.out.println(p);
	}
}
