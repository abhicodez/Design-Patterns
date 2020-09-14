package com.abhiwarez.designpattern.creational.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues		
		 Email email = new Email.EmailBuilder("to","from","subject").setHighPriority(true)
				 					.setMeetingInvite(true).build();
		 System.out.println(email);
		 
	}

}