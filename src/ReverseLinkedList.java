import java.io.*;
import java.util.*;
import java.lang.*;
public class ReverseLinkedList
{
	static Node head;
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
	
    Node ReverseNode(Node node)
    {
    	Node prev = null;
    	Node current = node;
    	Node next = null;
    	while(current !=null)
    	{
    		next = current.next;
    		current.next = prev;
    		prev = current;
    		current = next;
    	}
    	node = prev;
    	return node;
    }
    static void Printlist(Node node)
    {
    	while (node !=null)
    	{
    		System.out.println(node.data + "");
    		node = node.next;
    	}
    }
    public static void main(String[] args)
    {
    	ReverseLinkedList list = new ReverseLinkedList();
    	list.head = new Node(10);
    	list.head.next = new Node(100);
    	list.head.next.next = new Node(50);
    	list.head.next.next.next = new Node(200);
    	list.head.next.next.next.next = new Node(300);
        list.Printlist(head);
        System.out.println("Original Linked List is ");
        
        head = list.ReverseNode(head);	
        System.out.println("Reversed Linked List is ");
        list.Printlist(head);
        
   
    }
	
}