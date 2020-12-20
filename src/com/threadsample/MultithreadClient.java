package com.threadsample;

public class MultithreadClient 
{ 
    public static void main(String[] args) 
    { 
        int n = 9; // Number of threads 
        
        for (int i=0; i<n; i++) 
        { 
            MultithreadingDemo object = new MultithreadingDemo(); 
            System.out.println("------------Starting Thread---------->"+i);
            object.start(); 
        } 
    } 
} 