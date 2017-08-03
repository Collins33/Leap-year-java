
import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {
  @Test
  public void isLeapYear_forNumbersDivisibleByFour_true(){
    LeapYear leapYear=new LeapYear();
    assertEquals(true, leapYear.isLeapYear(2012));

  }

}
