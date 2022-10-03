public class SalesRep extends Object
{
   private String firstName; // Employee's First Name                       
   private String lastName; // Employee's Last Name                        
   private String employeeID; // employee ID            
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage

   // five-argument constructor                                       
   public SalesRep(String firstName, String lastName, 
      String employeeID, double grossSales, 
      double commissionRate)
   {                                                                  
      // implicit call to Object's default constructor occurs here              

      // if grossSales is invalid throw exception
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.firstName = firstName;                                     
      this.lastName = lastName;                                    
      this.employeeID = employeeID;         
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end constructor

   public void setFirstName(String firstName)
   {
	   if (firstName.length() >= 26)
		   throw new IllegalArgumentException(
				  "First Name must be under 25 letters." );
	   
	   this.firstName = firstName;
   }
   // return first name
   public String getFirstName()
   {
	   
      return firstName;
   }
   
   public void setLastName(String lastName)
   {
	   if (lastName.length() >= 26)
		   throw new IllegalArgumentException(
				  "Last Name must be under 25 letters." );
	   
	   this.lastName = lastName;
   }

   // return last name
   public String getLastName()
   {
      return lastName;
   } 

   public void setEmployeeID(String employeeID)
   {
	   if (employeeID.length() >= 13)
		   throw new IllegalArgumentException(
				  "Employee must be under 13 characters.");
	   
	   this.employeeID = employeeID;
   }
   // return social security number
   public String getEmployeeID()
   {
      return employeeID;
   } 

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // set SalesRep rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   } 

   // calculate earnings                 
   public double earnings()              
   {                                     
      return commissionRate * grossSales;
   } 

   // return String representation of SalesRep object         
   @Override // indicates that this method overrides a superclass method
   public String toString()                                             
   {                                                                    
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",    
         "Employee", firstName, lastName,                    
         "Employee ID", employeeID,                
         "gross sales", grossSales,                                     
         "commission rate", commissionRate);                           
   } 
} // end class SalesRep