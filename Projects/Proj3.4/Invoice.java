public class Invoice
{
   private String part;
   private String description;
   private int quanity;
   private double price;
   private double Total;

   // constructor initializes name with parameter name
   public Invoice(String part, String description, int quanity, double price) // constructor name is class name 
   {                                                               
      this.part = part;
      this.description = description;
      this.quanity = quanity;
      this.price = price;
   }
   public double getInvoiceAmount()
   {
	   if (quanity < 0)
	   {
		   quanity = 0;
	   }
	   if (price < 0.0)
	   {
		   price = 0.0;
	   }
	   this.Total = quanity * price;
	   return Total;
   }
   // method to set part number
   public void setPart(String part)
   {
	   this.part = part;
   }
   // method returns part name/id
   public String getPart()
   {
	   return part;   
   }
   
   public void setDescription(String description)
   {
	   this.description = description;
   }
   public String getDescription()
   {
	   return description;
   }
   
   public void setAmount(int quanity)
   {
	   this.quanity = quanity;
   }
   public int getAmount()
   {
	   return quanity;
   }
   
   public void setPrice(double price)
   {
	   this.price = price;
   }
   public double getPrice()
   {
	   return price;
   }
} // end class Invoice