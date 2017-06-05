package managementsoftware;
import java.io.*;
import java.lang.*;
import java.util.*;
class Threads extends Thread
{
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getId() + "  is running !");
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
}
public class Multithreading {
	public static void main(String[] args)
	{
	int n=8;
	for(int i=0;i<n;i++)
	{
		Threads object = new Threads();
		object.start();
	}
	}

}
