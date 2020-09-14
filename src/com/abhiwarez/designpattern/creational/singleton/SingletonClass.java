package com.abhiwarez.designpattern.creational.singleton;

import java.io.Serializable;


public class SingletonClass implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5078047477228276071L;
	
	private static volatile SingletonClass SINGLE_INSTANCE = null;
    
    private SingletonClass(){
        
        //Prevent form the reflection api.
        if (SINGLE_INSTANCE != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }
    
    public static SingletonClass getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (SingletonClass.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new SingletonClass();
                }
            }
        }
        return SINGLE_INSTANCE;
    }
    
    protected Object readResolve() 
    { 
        return getInstance(); 
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	} 
    
    
}