import java.io.*;
import java.util.*;
import java.lang.*;
public class ReverseLinkedListRecursive {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = next;
		}
	}
		
		static Node RecursiveUtil(Node curr, Node prev)
		{
			if(curr.next == null)
			{
				head = curr;
				curr.next = prev;
				return null;
			}
			Node next1 = curr.next;
			curr.next = prev;
			RecursiveUtil(next1, curr);
			return head;

		}
		static void PrintList(Node node)
		{
			while(node !=null)
			{
				System.out.println(node.data + "");
				node = node.next;
			}
		}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		ReverseLinkedListRecursive list = new ReverseLinkedListRecursive();
		list.head = new Node(100);
		list.head.next = new Node(140);
		list.head.next.next = new Node(300);
		list.head.next.next = new Node(500);
		PrintStream p = new PrintStream(new File("List.txt"));
		System.setOut(p);
		System.out.println("Original Linked List");
		PrintList(head);
		RecursiveUtil(head,null);
		System.out.println("Reversed Linked List ");
		PrintList(head);
		
	}

}
