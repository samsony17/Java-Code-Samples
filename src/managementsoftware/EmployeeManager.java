package managementsoftware;
import java.io.*;
import java.util.*;
import java.lang.*;
class Employee
{
	int salary = 100000;
	void Show()
	{
		System.out.println("Employee Salary" + salary);
	}
}
class Engineer extends Employee
{
	void Show()
	{
		System.out.println("Engineer Salary" + salary*2);
	}
}

class Manager extends Employee
{
	void Show()
	{
		System.out.println("Manager Salary " + super.salary *5);
	}
}
public class EmployeeManager {
	public static void main(String[] args)
	{
		Employee emp = new Manager();
		emp.Show();
	}

}
