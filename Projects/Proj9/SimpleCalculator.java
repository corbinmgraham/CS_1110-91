

public class SimpleCalculator // Single Test class
{
   public static void main(String[] args) // main
   { 
	   
	   int FinalProduct = 0;
      
	// check number of command-line arguments
	      if (args.length != 3)
	         System.out.printf(
	            "Error: Please re-enter the entire command, in this format:%n" + 
	            "java SimpleCalculator (First Number) (Operator) (Second Number)%n");
	      else
	      {
	         // get array size from first command-line argument
	         int firstNum = Integer.parseInt(args[0]);

	         // get initial value and increment from command-line arguments
	         String operator = args[1];
	         int secondNum = Integer.parseInt(args[2]);
	         
	         switch (operator)
	         {
	         case "+":
	        	 try
		         {
	        		 FinalProduct = firstNum + secondNum;
		         }
		         catch (IllegalArgumentException e)
		         {
		        	 System.out.printf("Excepton: %s%n%n", e.getMessage());
		         }
	        	 break;
	        	 
	         case "-":
	        	 try
		         {
	        		 FinalProduct = firstNum - secondNum;
		         }
		         catch (IllegalArgumentException e)
		         {
		        	 System.out.printf("Excepton: %s%n%n", e.getMessage());
		         }
	        	 break;
	        	 
	         case "x":
	        	 try
		         {
	        		 FinalProduct = firstNum * secondNum;
		         }
		         catch (IllegalArgumentException e)
		         {
		        	 System.out.printf("Excepton: %s%n%n", e.getMessage());
		         }
	        	 break;
	        	 
	         case "/":
	        	 if ( secondNum != 0) 
	        	 {
	        		 	try
	        		 	{
	        		 		FinalProduct = firstNum / secondNum;
	        		 	}
	        		 	catch (IllegalArgumentException e)
	        		 	{
	        		 		System.out.printf("Excepton: %s%n%n", e.getMessage());
	        		 	}
	        		  
	        	 }
	        	 else if ( secondNum == 0 )
	        	 {
	        		 System.out.print("Can not divide by zero.");
	        	 }
	        	 break;
	         default:
	        	 System.out.println("Incorrect Operator Entered.");
	         }
	         
	         try
	         {
	        	 System.out.printf("The answer is: %d", FinalProduct);
	         }
	         catch (IllegalArgumentException e)
	         {
	        	 System.out.printf("Excepton: %s%n%n", e.getMessage());
	         }
	      }
	   
   } // end main
} // end class Simple Calculator