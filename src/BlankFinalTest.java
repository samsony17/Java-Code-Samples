import java.util.*;
import java.io.*;
import java.lang.*;
public class BlankFinalTest {

	private final int i;
	BlankFinalTest(int val)
	{
		this.i = val;
	}
	BlankFinalTest()
	{
		this(10);
	}
	public static void main(String[] args)
	{
		BlankFinalTest test1 = new BlankFinalTest();
		System.out.println(test1.i);
		BlankFinalTest test2 = new BlankFinalTest(20);
		System.out.println(test2.i);
	}
}
