import static org.junit.Assert.*;

import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class DataDrivenCalTestDolanKreis {

	@RunWith (Parameterized.class)
	public class DataDrivenCalTest
	{
	   private int month1, day1, month2, day2, year, difference;

	public DataDrivenCalTest (int month1, int day1, int month2, int day2, int year)
	   {
	      this.month1 = month1;
	      this.day1 = day1;	      
	      this.month2 = month2;
	      this.day2 = day2;
	      this.year = year;
	   }
	  @Parameters
	  public static Collection<Object[]> calValues()
	  {
	     return Arrays.asList (new Object [][] {{3, 31, 4, 1, 2016}}); 
	  }
	  @Test
	  public void testManyCalculations()
	  {
	     assertEquals ("Many Calculations Test", 1, cal.cal(month1, day1, month2, day2, year));
	  }
	}
}
