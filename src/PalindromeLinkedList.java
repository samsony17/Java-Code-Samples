import java.io.*;
import java.util.*;
import java.lang.*;

class LinkedList
{
	private static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
}
public class PalindromeLinkedList extends LinkedList {
	public static boolean IsPalindrome(Node node)
	{
		boolean _isPalindrome = false;
		Stack s = new Stack();
		while(node != null)
		{
			s.push(node.data);
		}
		
		while(s.isEmpty() != true)
		{
		  ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add((Integer)s.pop());
			for(Integer a: arr)
			{
				while(node != null)
				{
					if(a == node.data)
					{
						_isPalindrome = true;
					}
					
				}
			}
		
		
		}
		
		
		return _isPalindrome;
		
	}
	
	public static void main(String[] args)
	{
		PalindromeLinkedList a = new PalindromeLinkedList();
	//	a.head = new Node(10);

	}

}