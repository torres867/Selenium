package JAVACollection_Set_29Oct;

import java.util.Set;
import java.util.TreeMap;

public class Map3 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String>  KK2 = new TreeMap<Integer,String>();
		KK2.put(123, "Shashank");
		KK2.put(231, "Pandey");
		KK2.put(456, "Delhi");
		KK2.put(987, "Senior Test Engineer L2");
		KK2.put(987,"Senior Test Engineer L3");
		
		Set<Integer> allkeys = KK2.keySet();
		
		for(Integer Y : allkeys)
		{
			System.out.println(" Keys is : " +Y);
			System.out.println(" Value is :" +KK2.get(Y));
		}
		
	}

}
