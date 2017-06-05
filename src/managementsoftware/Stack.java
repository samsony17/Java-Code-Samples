package managementsoftware;

import java.io.*;
import java.util.*;
import java.lang.*;
class StackException extends RuntimeException
{
	public StackException (String message)
	{
		super(message);
		}
}
public class Stack {
	private int top;
	private int[] storage;
	Stack(int capacity)
	{
		if(capacity <0)
		{
			throw new IllegalArgumentException("Stacks capacity must be positive");
		}
		storage = new int[capacity];
		top = -1;
		
	}
	void push(int value)
	{
		if(top == storage.length)
		{
			throw new StackException("Stacks been overflow");
		}
		top ++;
		storage[top] = value;
		
	}
	int pop ()
	{
		if(top == -1)
		{
			throw new StackException("Stack is Empty");
			
		}
		return top --;
	}
	int peek()
	{
		if(top == -1){
			throw new StackException("Stack is empty");
			
		}
		
		
		return storage[top];
	}
	boolean isEmpty()
	{
		return top ==-1;
	}
	
	int Count(Stack s)
	{
		int count = 0;
		while(s != null)
		{
			count++;
		}
		
		return count;
	}
	public static void main(String[] args)
	{
		Stack s= new Stack(10);
		s.push(10);
		s.push(50);
		s.push(70);
		s.push(100);
		s.push(150);
		s.push(200);
		System.out.println("Top Element " + s.peek());
		System.out.println("All the elements in the stack ");
		while(s != null)
		{
			for(int i =0;i<s.Count(s);i++)
			{
				System.out.println(s.pop());
			}
		}
	}

}
