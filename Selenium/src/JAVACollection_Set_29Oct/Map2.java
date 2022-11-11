package JAVACollection_Set_29Oct;

import java.util.LinkedHashMap;
import java.util.Set;

public class Map2 
{
    public static void main(String[] args) 
    {
    	LinkedHashMap<Integer,String> KK = new LinkedHashMap<Integer,String>();
    	KK.put(123,"Shashank");
    	KK.put(256,"Pandey");
    	KK.put(698,"Delhi");
    	KK.put(321,"Test Engineer");
    	KK.put(321, "Senior Test Engineer");
    	
    	Set<Integer> allkeys = KK.keySet();
    	
    	for(Integer x : allkeys)
    	{
    		System.out.println("Key is:" +x);
    		System.out.println("Value is:" +KK.get(x));
    	}
		
	}
}
