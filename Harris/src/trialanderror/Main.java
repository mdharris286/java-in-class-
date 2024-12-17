package trialanderror;
import java.util.*;
public class Main {
	public static void main(String[]args)
	{
		LinkedList arr = new LinkedList<>();
		arr.add(21);
		arr.add("string");
		arr.add('c');
		System.out.println(arr);
		arr.set(1,"qwerty");
		System.out.println(arr.get(1));
	}

}
