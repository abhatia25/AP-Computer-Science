/*Aditya Bhatia
9/19/2019
Calendar App */

import java.io.*;

public class Calendars {
   public static int month;
   
   public static void main(String[] args)
   {
      try 
      {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter the month: ");
         month = Integer.parseInt(reader.readLine());
      } 
      catch (IOException ioe)
      {
      
      }
      DisplayMonths(month);
   }
   static void DisplayMonths(int monthVal)
   {
      int x = monthVal % 12;
      switch(x) 
      {
         case 1:
            System.out.println("January");
            break;
         case 2:
            System.out.println("February");
            break;
         case 3:
            System.out.println("March");
            break;
         case 4:
            System.out.println("April");
            break;
         case 5:
            System.out.println("May");
            break;
         case 6:
            System.out.println("June");
            break;
         case 7:
            System.out.println("July");
            break;
         case 8:
            System.out.println("August");
            break;
         case 9:
            System.out.println("September");
            break;
         case 10:
            System.out.println("October");
            break;
         case 11:
            System.out.println("November");
            break;
         case 0:
            System.out.println("December");
            break;
      }
   }
}