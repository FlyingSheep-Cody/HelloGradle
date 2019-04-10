package HelloGradle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculateServiceTest {

	private CalculateService service;

	@Before
	public void SetUp() {
		service = new CalculateService();
	}

	@Test
	public void TestSum()
	{
		Integer result = service.Sum(1, 2);
		assertEquals(result, (Integer)3);		

	}
	
	@Test
	public void TestMinus()
	{
		Integer result = service.Minus(5, 1);
		assertEquals(result, (Integer)4);		

	}

}
