import java.util.Scanner; // program uses class Scanner

public class Addition
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      int hoursWorked; // The number of hours the employee worked
      int payRate; // How much the employee gets payed per hour
      int grossPay = 0; // sum of number1 and number2
      int gp2 = 0;

      System.out.print("Enter hours worked: "); // prompt 
      hoursWorked = input.nextInt(); // read first number from user

      System.out.print("Enter pay rate ($/hour): "); // prompt 
      payRate = input.nextInt(); // read second number from user
      
      if (hoursWorked <= 40)
      {
    	  grossPay = hoursWorked * payRate; // multiply then keep
      }
      else if (hoursWorked >= 41)
      {
    	  hoursWorked = hoursWorked - 40;
    	  grossPay = (40 * payRate) + (hoursWorked * (payRate * 2));
      }

      System.out.printf("Workers pay is $%d%n", grossPay); // display gross pay
   } // end method main
} // end class Addition