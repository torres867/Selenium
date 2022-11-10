package JAVACollection_Set_29Oct;

import java.util.HashMap;
import java.util.Set;

public class Map1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> HM = new HashMap<Integer,String>();
		
		HM.put(12,"Shashank");
		HM.put(25,"Pandey");
		HM.put(345,"Test Engineer");
		HM.put(987, "Delhi");
		HM.put(123,"TCS");
		
		Set<Integer> allkeys = HM.keySet();
		
		for(Integer X : allkeys )
		{
			System.out.println("Key Inputs Result is "+X);
			System.out.println("Value Result is "+HM.get(X));
		}
		
	}

}
