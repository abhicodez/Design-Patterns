package com.abhiwarez.designpattern.creational;

import java.io.*;

public class SingletonTester {
	   public static void main(String[] args) {
	      
		   try
	        { 
	            SingletonClass instance1 = SingletonClass.getInstance(); 
	            ObjectOutput out  
	                = new ObjectOutputStream(new FileOutputStream("file.text")); 
	            out.writeObject(instance1); 
	            out.close(); 
	            ObjectInput in  
	                = new ObjectInputStream(new FileInputStream("file.text")); 
	            SingletonClass instance2 = (SingletonClass) in.readObject(); 
	            in.close(); 
	          
	            System.out.println("instance1 hashCode:- "
	                                           + instance1.hashCode()); 
	            System.out.println("instance2 hashCode:- "
	                                           + instance2.hashCode()); 
	        }  
	          
	        catch (Exception e) 
	        { 
	            e.printStackTrace(); 
	        } 
	   }
	}

