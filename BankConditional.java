/* Aditya Bhatia
9/27/2019
Bank Conditionals*/ 
import java.io.*;

public class BankConditional {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double balance = 0;
      
      try
      {
         System.out.println("Enter balance: ");
         balance = Double.parseDouble(br.readLine());
         if (balance < 25)
         {
            System.out.println("You cannot withdraw money");
         }
         else
         {
            System.out.println("Enter amount to withdraw: ");
            double withdraw = Double.parseDouble(br.readLine());
            balance -= withdraw;
            System.out.println("Your new balance is: " + balance);
         }
      }
      catch (IOException e)
      {
      }
      catch (Exception x)
      {
         System.out.println("Please enter a numerical value");
      }
   }
}