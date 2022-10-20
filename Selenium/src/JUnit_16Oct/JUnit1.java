package JUnit_16Oct;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit1 
{
	@BeforeClass
	public static void BeforeClasss()
	{
		System.out.println(" Before Class Annotation ");
	}

	@Before
	public void Before()
	{
		System.out.println(" Before Annotation ");
	}
	
	@Ignore
	@Test
	public void Test1()
	{
		System.out.println(" Test Case 1 ");
	}
	
	@Test
	public void Test2()
	{
		System.out.println(" Test Case 2 ");
	}
	
	@After
	public void After()
	{
		System.out.println(" After Annotation ");
	}
	
	@AfterClass
	public static void AfterClass()
	{
		System.out.println(" After Class Annotation ");
	}
}
