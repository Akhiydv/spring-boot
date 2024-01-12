package com.observer;

public class Youtube 
{

	public static void main(String[] args) 
	{
		Channel telusko = new Channel();
		
		Subscriber s1=new Subscriber("Akhilesh");
		Subscriber s2=new Subscriber("Akash");
		Subscriber s3=new Subscriber("Ankit");
		Subscriber s4=new Subscriber("Vikas");
		Subscriber s5=new Subscriber("Ketan");
		
		telusko.subscribe(s1);
		telusko.subscribe(s2);
		telusko.subscribe(s3);
		telusko.subscribe(s4);
		telusko.subscribe(s5);
		
		//telusko.unSubscribe(s4);
		
		s1.subscribeChannel(telusko);
		s2.subscribeChannel(telusko);
		s3.subscribeChannel(telusko);
		s4.subscribeChannel(telusko);
		s5.subscribeChannel(telusko);
		
		telusko.upload("How to learn Java??");
		
	}
}
