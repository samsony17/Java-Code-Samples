package strategypattern;
import java.io.*;
import java.util.*;
import java.lang.*;

public class FlyWithWings implements FlyBehavior {
	public void fly()
	{
		System.out.println("I am Flying with wings!");
	}

}
