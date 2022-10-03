
import java.security.SecureRandom; // uses the secure random method
import java.util.Scanner;


public class Maths 
{
	// Variables in here
	
	SecureRandom ranNum = new SecureRandom();
	private int ranNum1, ranNum2, ranGen, an;
	
   public Maths() // constructor
   {

   }
   
   public void inputContent() // input method
   {
	   
	   Scanner input = new Scanner(System.in);
	   
	  randomNumGen();
	   
	   System.out.print("\nHow much is " + ranNum1 + " times " + ranNum2 + "?\n\nAnswer or -1 to quit: ");
	   an = input.nextInt();
	   
	   while ( an != -1 )
	   {
		   
		   if (an == ranGen)
		   {
			   System.out.printf("\nVery good!\n");
		   }
		   else if (an != ranGen)
		   {
			   System.out.printf("\nNo.  Please try again.\n");
			   
			   while (an != ranGen)
			   {
				   
			   System.out.print("\nHow much is " + ranNum1 + " times " + ranNum2 + "?\n\nAnswer: ");
			   an = input.nextInt();
			   }
			   
			   
			   System.out.printf("\nVery good!\n");
		   }
		   
		   randomNumGen();
		   
		   System.out.print("\nHow much is " + ranNum1 + " times " + ranNum2 + "?\n\nAnswer or -1 to quit: ");
		   an = input.nextInt();
	   }
	   
	   System.out.printf("\n\nBye!\n\n");
	   
   }
   
   public void randomNumGen()
   {
	   ranNum1 = 1 + ranNum.nextInt(12);
	   ranNum2 = 1 + ranNum.nextInt(12);
	   ranGen = ranNum1 * ranNum2;
   }
   
   
} // end class Maths