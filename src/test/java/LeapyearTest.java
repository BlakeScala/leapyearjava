import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class LeapyearTest{
  //REMEMBER TO RENAME!!!!!!1!one!
  @Test
  public void leapyearRun_isdivisbleby4_true() {
    Leapyear leapyear = new Leapyear();
    assertEquals(true, leapyear.leapyearRun(4));
  }

  @Test
  public void leapyearRun_isdivisbleby100_false() {
    Leapyear leapyear = new Leapyear();
    assertEquals(false, leapyear.leapyearRun(1900));
  }
}
