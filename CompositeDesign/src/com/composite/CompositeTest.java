package com.composite;

public class CompositeTest
{

	public static void main(String[] args) 
	{
		Component hd=new leaf(4000,"HDD");
		Component mouse=new leaf(500,"Mouse");
		Component monitor=new leaf(9000,"Monitor");
		Component ram=(Component) new leaf(3000,"RAM");
		Component cpu=new leaf(9000,"CPU");
		
		Composite ph=new Composite("Peri");
		Composite cabinet=new Composite("Cabinet");
		Composite mb=new Composite("MB");
		Composite computer=new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
		
	}

}
