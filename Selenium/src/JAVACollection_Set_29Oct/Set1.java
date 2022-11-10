package JAVACollection_Set_29Oct;

import java.util.HashSet;

public class Set1 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		
		// Creating the object for the Integer
		
		hs.add(123);
		hs.add(245);
		hs.add(896);
		hs.add(123);
		hs.add(569);
		hs.add(789);
		
		// In collection will use For each loop
		
		for(Integer i : hs)

		{
			System.out.println(i);
		}
	}

}
