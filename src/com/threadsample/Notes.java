package com.threadsample;

public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("A thread is a light-weight smallest part of a process that can run"
				+ " concurrently with the other parts(other threads) of the same process");
		
		System.out.println("The process of executing multiple threads simultaneously is known as multithreading.");
		
		
		System.out.println("NEW – A thread that has not yet started is in this state.");
		
		System.out.println("RUNNABLE – A thread executing in the Java virtual machine is in this state.");
		
		System.out.println("BLOCKED – A thread that is blocked waiting for a monitor lock is in this state.");
		
		System.out.println("WAITING – A thread that is waiting indefinitely for another thread to perform a particular action is in this state.");
		
		System.out.println("TIMED_WAITING – A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state");
		
		System.out.println("TERMINATED – A thread that has exited is in this state.");
		
		System.out.println("A thread can be in only one state at a given point in time.");
		
		
		System.out.println("************Few Terms ****************");
		
		System.out.println("Multitasking: Ability to execute more than one task at the same time is known as multitasking.");

		System.out.println("Multithreading: We already discussed about it. It is a process of executing multiple threads simultaneously. Multithreading is also known as Thread-based Multitasking.");

		System.out.println("Multiprocessing: It is same as multitasking, however in multiprocessing more than one CPUs are involved. On the other hand one CPU is involved in multitasking.");

		System.out.println("Parallel Processing: It refers to the utilization of multiple CPUs in a single computer system.");

		System.out.println("************2 Ways to implement Threads ****************");

		System.out.println("Extending the Thread class");

		System.out.println("Implementing Runnable interface");

	}

}
