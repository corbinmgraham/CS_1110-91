import java.util.Scanner;

public class Gas
{
   private int miles;
   private int gallons;
   private double mpg;
   private int tripCount;
   private double average;
   private double totalMpg;

   // constructor initializes name with parameter name
   public Gas() // constructor name is class name 
   {

   }
   

   public void inputContent()
   {

	   miles = 0;
	   gallons = 0;
	   mpg = mpg;
	   
	   tripCount = 0;
	   average = 0.0;
	   totalMpg = 0.0;
	   
	   Scanner input = new Scanner(System.in);
	   
	   // first employee hours
	   System.out.print("Enter miles driven or -1 to quit: ");
	   miles = input.nextInt();
	      
	   while ( miles != -1 )
	   {
		   tripCount += 1;
		
		   System.out.print("Enter gallons used: ");
		   gallons = input.nextInt();
		   
		   mpg = calculateMpg(miles, gallons);
		   totalMpg += mpg;
		   
		   displayTrip();
		   displayContent();
		   
		   System.out.print("Enter miles driven or -1 to quit: ");
		   miles = input.nextInt();
		   
	   }
	   
	   // calculate & display average
	   displayContent();
	   
	   
   }
   
   public double calculateMpg(int mls, int glns)
   {
	    	  mpg = mls / glns; // multiply then keep

	   return mpg;
   }
   
   public double getMpgAverage()
   {
	   if( tripCount > 0)
	   {
		   this.average = totalMpg / tripCount;
	   }
	   else
	   {
		   this.average = 0.0;
	   }
		   
	   return average;
   }
   
   public void displayTrip()
   {
	   		// display values
	   		System.out.printf("Miles Driven: %d%n", miles);
	   		System.out.printf("Gallons Used: %d%n", gallons);
	   		System.out.printf("Miles Per Gallon: %.2f%n", mpg);
   } 
   
   public void displayContent()
   {
	   System.out.printf("Trip Count: %d%n", tripCount);
	   System.out.printf("Total trips Pay: %.2f%n", totalMpg);
	   System.out.printf("Average Miles Per Gallon: %.2f%n", getMpgAverage());
   }
   
   // method to set hours worked
   public void setMiles(int miles)
   {
	   this.miles = miles;
   }
   // method returns hours worked
   public int getMiles()
   {
	   return miles;   
   }
   // method to set pay rate
   public void setGallons(int gallons)
   {
	   this.gallons = gallons;
   }
   // method returns pay rate
   public double getGallons()
   {
	   return gallons;   
   }
   
} // end class account