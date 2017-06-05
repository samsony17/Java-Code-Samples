import java.io.*;
import java.util.*;
import java.lang.*;
class CarA
{
	public int maxSpeed;
	public static int Vehicle(int maxSpeed)
	{
		 return maxSpeed = 120;
	}
	public void Display(int maxSpeed)
	{
	
		System.out.println("Speed of the vehicle CarA is " + Vehicle(maxSpeed));
	}
}
class CarB extends CarA
{

	public  void Display()
	{
		System.out.println("Speed of the vehicle CarB is " + super.Vehicle(maxSpeed));
	}
}
public class SuperTest  {


public static void main(String[] args)
{
	try
	{
	CarB carb = new CarB();
	carb.Display();
	}
	catch(Exception ex)
	{
		System.out.println(ex.toString());
	}
	finally
	{
		System.out.println("Car B maxSpeed is inherited from Car A 's maxSpeed ");
	}
}
protected void finalize() throws Throwable
{
	
}
}
