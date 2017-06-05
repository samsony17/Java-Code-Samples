package managementsoftware;
import java.io.*;
import java.util.*;
import java.lang.*;
class Generic <K,V>
{
	K key;
	V value;
	Generic(K key,V value)
	{
		this.key= key;
		this.value = value;
	}

	public <K,V> void Print(K key, V value)
	{
		System.out.println(key +"");
		System.out.println(value);
	}
	
}
public class GenericCollection <T>{
	T obj ;
	GenericCollection(T obj)
	{
		this.obj = obj;
	}
	public T getObject()
	{
		return this.obj; 
	}
	public static void main(String[] args)
	
	{
		GenericCollection<String> gc1 = new GenericCollection<>("Samson");
	    System.out.println(gc1.getObject());
	    GenericCollection<Integer>gc2 = new GenericCollection<>(1);
	    System.out.println(gc2.getObject());
	    Generic<String, Integer> gc3 = new Generic<String, Integer>("SamsonYerraguntla", 1);
	  
	}
}