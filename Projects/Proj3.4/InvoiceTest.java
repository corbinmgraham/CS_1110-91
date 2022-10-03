import java.util.Scanner;

public class InvoiceTest
{
   public static void main(String[] args)
   { 
      // create two Account objects
      Invoice item1 = new Invoice("Handy Dust Pan 5000", "This dust pan is far from ordinary... You can hold dust in upside down with SmartStik Technology.", 2, 12.99); 

      // display initial value of name for each Account
      System.out.printf("Product is: %s%n", item1.getPart());
      System.out.printf("Product description is: %s%n", item1.getDescription());
      System.out.printf("Quanity: %s%n", item1.getAmount());
      System.out.printf("Price for item: %.2f%n", item1.getPrice());
      System.out.printf("Total Price: %.2f%n", item1.getInvoiceAmount());
   } 
} // end class InvoiceTest