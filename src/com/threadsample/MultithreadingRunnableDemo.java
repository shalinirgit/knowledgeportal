package com.threadsample;

class MultithreadingRunnableDemo implements Runnable{  
	
	  public void run(){  
	    System.out.println("My thread is in running state.");  
	  }   
	  
	  
	  public static void main(String args[]){  
		 
		 MultithreadingRunnableDemo obj=new MultithreadingRunnableDemo();  
	     Thread tobj =new Thread(obj);  
	     tobj.start();  
	 }  
	  
	}