package com.adapt;

public class AssignmentWork
{
	//defining Pen p for AssignmentWork class
	private Pen p;
	
	//getter and setter
	public Pen getP()
	{
		return p;
	}
	public void setP(Pen p)
	{
		this.p=p;
	}
	
	//WriteAssignment method
	public void WriteAssignment(String str)
	{
		p.write(str);
	}
}
