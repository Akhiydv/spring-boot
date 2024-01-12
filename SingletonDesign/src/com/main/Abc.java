package com.main;

public class Abc 
{
 static Abc obj1=new Abc();
 
 private Abc() 
 {
	 
 }
 public static Abc getInstance() 
 {
	 return obj1;
 }
}
