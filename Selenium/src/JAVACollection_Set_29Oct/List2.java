package JAVACollection_Set_29Oct;

import java.util.LinkedList;

public class List2 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> LL = new LinkedList<Integer>();
		
		LL.add(123);
		LL.add(256);
		LL.add(789);
		LL.add(969);
		LL.add(859);
		LL.add(789);
		
		for(Integer y : LL)
		{
			System.out.println(y);
		}
    }
}
