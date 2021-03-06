package managementsoftware;

import java.io.*;
import java.util.*;
import java.lang.*;
public class ReverseLinkedList {

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
		
		Node ReverseLinked(Node node)
		{
			Node prev = null;
			Node current = head;
			Node next = null;
			
			while(current != null)
			{
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			node = prev;
			return node;
		}
		
		
	}
	public static void main(String[] args)
	{
		ReverseLinkedList a = new ReverseLinkedList();
	   a.head = new Node(15);
	    a.head.next = new Node (30);
	    a.head.next = new Node(45);
	    
	}
}
