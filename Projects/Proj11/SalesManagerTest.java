import java.util.Scanner;

public class SalesManagerTest
{
	public static void main(String[] args) 
	   {
	      Scanner input = new Scanner(System.in);
	      
	       
	      
	      System.out.print("Enter employee's Base Salary: "); // prompt
	      double baseSalary = input.nextDouble(); // obtain user input
	      
	      // instantiate CommissionEmployee object
	      SalesManager employee = new SalesManager(
	         "Sue", "Jones", "222-22-2222", 10000, .06, baseSalary);  
	      
	      employee.setBaseSalary(baseSalary);
	      
	   
	      
	      System.out.println("Enter employee's first name:"); // prompt
	      String firstName = input.next(); // obtain user input
	      employee.setFirstName(firstName);
	      
	      System.out.println("Enter employee's last name: "); // prompt
	      String lastName = input.next(); // obtain user input
	      employee.setLastName(lastName);
	      
	      System.out.println("Enter employee's ID: "); // prompt
	      String employeeID = input.next(); // obtain user input
	      employee.setEmployeeID(employeeID);
	      
	      System.out.print("Enter employee's gross sales: "); // prompt
	      int grossSales = input.nextInt(); // obtain user input
	      employee.setGrossSales(grossSales);
	      System.out.print("Enter employee's Commission Rate: "); // prompt
	      double commissionRate = input.nextDouble(); // obtain user input
	      employee.setCommissionRate(commissionRate);
	      
	      
	      // get commission employee data
	      System.out.println(
	         "Employee information obtained by get methods:");
	      System.out.printf("%n%s %s %s%n", "Employee name is",
	         employee.getFirstName(), employee.getLastName());
	      System.out.printf("%s %s%n", "Employee ID is", 
	         employee.getEmployeeID());
	      System.out.printf("%s %.2f%n", "Gross sales is", 
	         employee.getGrossSales());
	      System.out.printf("%s %.2f%n", "Commission rate is",
	         employee.getCommissionRate());
	      System.out.printf("%s %.2f%n", "Base Salary is",
	    	 employee.getBaseSalary());
	      System.out.printf("%s %.2f%n", "Employee pay is",
	    	 employee.earnings());

	      employee.setGrossSales(5000); 
	      employee.setCommissionRate(.1); 
	      
	      System.out.printf("%n%s:%n%n%s%n",                                
	         "Employee information obtained by toString", employee.toString());
	   } // end main
} // end class SalesManagerTest