package JAVACollection_Set_29Oct;

import java.util.LinkedHashSet;

public class Set2 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> hs2 = new LinkedHashSet<Integer>();
		hs2.add(256);
		hs2.add(896);
		hs2.add(145);
		hs2.add(123);
		hs2.add(123);
		hs2.add(987);
		
		for(Integer i : hs2)
		{
			System.out.println(i);
		}
	}
}
