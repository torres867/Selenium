package JUnit_16Oct;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit 
{
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println(" Before Class Annotation ");
	}
	
	@Before
	public void before()
	{
		System.out.println(" Before Annotation ");
	}
	
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
	public void after()
	{
		System.out.println(" After Annotation ");
	}

	@AfterClass
	public static void afterclass()
	{
		System.out.println(" After Class Anotation ");
	}
}
