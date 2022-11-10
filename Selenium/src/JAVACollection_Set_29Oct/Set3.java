package JAVACollection_Set_29Oct;

import java.util.TreeSet;

public class Set3 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> hs3 = new TreeSet<Integer>();
		hs3.add(123);
		hs3.add(256);
		hs3.add(568);
		hs3.add(159);
		hs3.add(123);
		hs3.add(789);
		
		for(Integer x : hs3)
		{
			System.out.println(x);
		}
	}
}
