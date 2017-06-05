import java.io.*;
import java.util.*;
import java.lang.*;
public class StackMin <T> {
	private static class StackNode <T>
	{
		private T data;
		private StackNode<T> next;
		public StackNode(T data)
		{
			this.data = data;
		}
		private StackNode<T> top;
		public T pop()
		{ 
			if(top == null) throw new EmptyStackException();
			T item = top.data;
			top = top.next;
	  return item;
			
		}
		public T min()
		{
			if(top == null )throw new EmptyStackException();
			T item = top.data;
			top = top.next;
			return item;
		}
		
	}
}
