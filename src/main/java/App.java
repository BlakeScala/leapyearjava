import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a number to see if it's a leap year.");
    String stringInputNumber = console.readLine();
    Integer inputNumber = Integer.parseInt(stringInputNumber);

    Leapyear leapyear = new Leapyear();

    boolean consoleAnswer = leapyear.leapyearRun(inputNumber);

    if (consoleAnswer == true){
      System.out.println("That is a leap year!");
    } else {
      System.out.println("That is NOT a leap year!");
    }
  }
}
