package com.adapt;

public class School
{
	public static void main(String args[])
	{
		//connecting Pen to PenAdapter
		Pen p=new PenAdapter();
		
		//making new object of AssignmentWork class
		AssignmentWork aw=new AssignmentWork();
		//calling Pen p in aw object
		aw.setP(p);
		//calling WriteAssignment in aw object 
		aw.WriteAssignment("Hello Assignment...");
	}
}
