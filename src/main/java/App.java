import java.io.Console;

public class App{
  public static void main(String[] args) {
  Console myConsole = System.console();
  System.out.println("Enter a year:");
  String stringYear= myConsole.readLine();
  int intYear = Integer.parseInt(stringYear);
  LeapYear leapYear=new LeapYear();
  boolean leapYearResult= leapYear.isLeapYear(intYear);
  System.out.println("is that year a leapYear?:" + leapYearResult);
  }

}
