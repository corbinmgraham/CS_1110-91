import java.util.Scanner;

public class Account
{
   private int hours;
   private double payRate;
   private double pay;
   private int employeeCount;
   private double average;
   private double totalPay;

   // constructor initializes name with parameter name
   public Account() // constructor name is class name 
   {

   }
   

   public void inputContent()
   {

	   hours = 0;
	   payRate = 0;
	   pay = pay;
	   
	   employeeCount = 0;
	   average = 0.0;
	   totalPay = 0.0;
	   
	   Scanner input = new Scanner(System.in);
	   
	   // first employee hours
	   System.out.print("Enter employee hours or -1 to quit: ");
	   hours = input.nextInt();
	      
	   while ( hours != -1 )
	   {
		   employeeCount += 1;
		
		   System.out.print("Enter employee pay rate (per hour): ");
		   payRate = input.nextDouble();
		   
		   pay = calculatePay(hours, payRate);
		   totalPay += pay;
		   
		   displayEmployee();
		   displayContent();
		   
		   System.out.print("Enter employee hours or -1 to quit: ");
		   hours = input.nextInt();
		   
	   }
	   
	   // calculate & display average
	   displayContent();
	   
	   
   }
   
   public double calculatePay(int hrs, double pRate)
   {
	   if ( hrs <= 40)
	      {
	    	  pay = hrs * pRate; // multiply then keep
	      }
	      else if (hrs >= 41)
	      {
	    	  hrs = hrs - 40;
	    	  pay = (40 * pRate) + (hrs * (pRate * 1.5));
	      }

	   return pay;
   }
   
   public double getAccountAverage()
   {
	   if( employeeCount > 0)
	   {
		   this.average = totalPay / employeeCount;
	   }
	   else
	   {
		   this.average = 0.0;
	   }
		   
	   return average;
   }
   
   public void displayEmployee()
   {
	   		// display values
	   		System.out.printf("Hours Worked: %d%n", hours);
	   		System.out.printf("Pay Rate (per hour): %.2f%n", payRate);
	   		System.out.printf("Employee Pay: %.2f%n", pay);
   } 
   
   public void displayContent()
   {
	   System.out.printf("Employee Count: %d%n", employeeCount);
	   System.out.printf("Total Pay: %.2f%n", totalPay);
	   System.out.printf("Average Pay: %.2f%n", getAccountAverage());
   }
   
   // method to set hours worked
   public void setHours(int hours)
   {
	   this.hours = hours;
   }
   // method returns hours worked
   public int getHours()
   {
	   return hours;   
   }
   // method to set pay rate
   public void setPayRate(double payRate)
   {
	   this.payRate = payRate;
   }
   // method returns pay rate
   public double getPayRate()
   {
	   return payRate;   
   }
   
} // end class account