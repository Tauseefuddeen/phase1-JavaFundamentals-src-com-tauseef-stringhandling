package com.tauseef.stringhandling;

public class StringBufferDemo {

	public static void main(String[] args) {

		//string buffer is allow to create a mutable string )thread safe)/
		//thread safe :- one thread will operate on string buffer at a time.
		
		//create a mutable string 
		StringBuffer message = new StringBuffer("Today is a good day !");
		
		System.out.println(message);
		
		//string modification 
		//append text
		message.append(" Happy learning !");
		System.out.println(message);
		
		//replace test
		message.replace(0, 1,"t");
		System.out.println(message);
		
		//delete text
		message.delete(0, 1);
		System.out.println(message);
		
		//insert test
		message.insert(0, "Welcome");
		System.out.println(message);
		
	}

}
