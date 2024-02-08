import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class TestCal {
	private Cal c=new Cal();
	@BeforeAll
	public static void setup()
	{
		System.out.println("Before All Test");
	}
	
	@BeforeEach
	public  void BeforeTest()
	{
		System.out.println("Before Each Test");
	}
	@Test
	void TestAdd()
	{
		int expres=65;
		int actualRes=c.Add(1, 2);
		Assert.assertEquals(expres, actualRes);
	}
	@Test
	void TestMulti()
	{
		int expres=2;
		int actualRes=c.Multi(1, 2);
		Assert.assertEquals(expres, actualRes);
	}
	@Test
	void TestSubct()
	{
		int expres=2;
		int actualRes=c.subt(1, 2);
		Assert.assertEquals(expres, actualRes);
	}
	@AfterAll
	public static void AfterAllTest()
	{
		System.out.println("After All Test");
	}
	
	@AfterEach
	public  void AfterEachTest()
	{
		System.out.println("After Each Test");
	}
	
	
}
