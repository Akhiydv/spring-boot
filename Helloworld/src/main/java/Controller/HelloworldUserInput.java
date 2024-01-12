package Controller;

import java.util.Scanner;

public class HelloworldUserInput 
{
 public static void main(String[] args)
 {
	Scanner s=new Scanner(System.in); 
	System.out.println("Enter the String to Print...");
	String str=s.nextLine();
	System.out.println("The entered Strin is : "+str);
 }
}
