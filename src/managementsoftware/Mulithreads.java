package managementsoftware;
import java.io.*;
import java.util.*;
import java.lang.*;
 class MultiDemo implements Runnable {
	 public void run()
	 {
		 try
		 {
			 System.out.println(Thread.currentThread().getId() + " is running");
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
		 }
	 }
	

}
 public class Mulithreads 
 {
	 public static void main(String[] args)
	 {
		 int n =8;
	     for(int i=0;i<n ;i++)
	     {
	    	Thread object = new Thread(new MultiDemo());
	    	object.start();
	    	
	     }
		 
		 
	 }
 }
