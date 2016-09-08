//REMEMBER TO RENAME
public class Leapyear {

  public boolean leapyearRun(int year)
  {
    if(year % 100 == 0)
      return false;
    else if(year % 4 == 0)
      return true;
    else
      return false;
  }
}
