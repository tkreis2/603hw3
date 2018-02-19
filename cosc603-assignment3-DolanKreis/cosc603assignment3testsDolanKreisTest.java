import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import src.Calc;
import src.Object;

public class cosc603assignment3testsDolanKreisTest {

	//Testing a month/day combination that doesn’t exist (such as February 30)
	@Test
	public void testBadMonthDay()
	{
		int answer = cal.cal(2, 30, 3, 1, 2017);
	assertEquals ("Expect -1", -1, answer);	
	}
	
	//Testing a leap year
	@Test
	public void testLeapYear()
	{
		int answer = cal.cal(2, 12, 3, 19, 2016);
	assertEquals ("Expect 36", 36, answer);
	}
	
	//Test “extremes”, so test year = 1 and year = 10000, month = 1, 12, and day = 1, 31
	
	//Testing minimum year value
	@Test
	public void testMinYear()
	{
		int answer = cal.cal(3, 2, 6, 24, 1);
	assertEquals("Min Year (== 1)", 114, answer);
	}

	//Test maximum year value
	@Test
	public void testMaxYear()
	{
		int answer = cal.cal(3, 2, 6, 24, 10000);
	assertEquals("Max Year (==10000)", 114, answer);	
	}
	
	//Test minimum day value
	@Test
	public void testMinDay()
	{
		int answer = cal.cal(6, 1, 9, 8, 2017);
		assertEquals("Min Day (== 1)", 99, answer);	
	}
	
	//Test maximum day value
	@Test
	public void testMaxDay() 
	{
		int answer = cal.cal(1, 31, 2, 4, 2017);
		assertEquals("Max Day (==31)", 4, answer);	
	}
	
	//Test minimum month value
	@Test
	public void testMinMonth()
	{
		int answer = cal.cal(1, 8, 4, 13, 2017);
		assertEquals("Min Month (==1)", 95, answer);
	}
	//Test maximum month value
	@Test
	public void testMaxMonth()
	{
		int answer = cal.cal(9, 3, 12, 29, 2017);
		assertEquals("Max Month (== 12)", 117, answer);	
	}
	
}