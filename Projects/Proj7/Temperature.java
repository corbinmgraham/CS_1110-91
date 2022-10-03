import java.util.Scanner; // uses the scanner method

public class Temperature
{
	private double initTemp = 0.0;
	private double calcTemp = 0.0;
	private int cof = 0;
	
   public Temperature() // constructor
   {

   }
   
   public void inputContent() // inputs the temperature from the user then displays it
   {
	   initTemp = 0.0;
	   calcTemp = 0.0;
	   cof = 0;
	   
	   Scanner input = new Scanner(System.in);
	   
	   // ask user if they want to enter celsius or fahrenheit
	   System.out.print("Is the temperature Fahrenheit(1), or Celsius(2)? Enter -1 to quit: ");
	   cof = input.nextInt();
	   
	   // Go through loop until -1 is entered
	   while ( cof != -1 )
	   {
		   // get temperature from user
		   System.out.print("Enter temperature: ");
		   initTemp = input.nextDouble();
		   
		   if ( cof == 1 ) // if fahrenheit, call celsius
		   {
			   celsius();
		   }
		   // if celsius, call fahrenheit
		   else if ( cof == 2 )
		   {
			   fahrenheit();
		   }
		   
		   // display result to user
		   displayContent();
		   		   
		   System.out.print("Is the temperature Fahrenheit(1), or Celsius(2)? Enter -1 to quit: ");
		   cof = input.nextInt();
		   
	   }
	   
   }
   
   
   public void displayContent() // displays the temperature -- needed method?
   {
	   System.out.printf("Temperature is: %.2f%n", calcTemp);
   }
   
   public void celsius() // converts fahrenheit to celsius -- instructions say integer method
   {
	   calcTemp = 5.0 / 9.0 * (initTemp - 32);
   }
   
   public void fahrenheit() // converts celsius to fahrenheit -- instructions say integer method
   {
	   calcTemp = 9.0 / 5.0 * initTemp + 32;  
   }
   
} // end class Temperature