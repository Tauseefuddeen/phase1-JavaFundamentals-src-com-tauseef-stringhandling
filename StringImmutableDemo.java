package com.tauseef.stringhandling;

public class StringImmutableDemo {
	
	public static void main(String[] args) {
		
		//in java string object are immutable
		//immutable simply mean unmodifiable or non changeable values.
		
		String username ="John";
		
		//update the string -> concat()
		String response = username.concat("Smith");
		
		System.out.println(username);//old string -> John
		System.out.println(response);//new string -> john Smith
		
	}

}
