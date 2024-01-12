package com.adapt;

import com.akhi.PilotPen;

public class PenAdapter implements Pen 
{

	//making new object of Pilot Pen
	PilotPen pp=new PilotPen();
	
	//overriding the write method again here
	@Override
	public void write(String str)
	{
		pp.mark(str);
		
	}

}
