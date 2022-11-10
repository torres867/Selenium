package JAVACollection_Set_29Oct;

import java.util.ArrayList;

public class List1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> AL = new ArrayList<Integer>();
		
		AL.add(123);
		AL.add(236);
		AL.add(569);
		AL.add(789);
		AL.add(123);
		AL.add(896);
		
		for(Integer x : AL)
		{
			System.out.println(x);
		}
	}
}
