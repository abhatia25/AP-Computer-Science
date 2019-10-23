/* Aditya Bhatia
10/08/2019
Password*/

import java.io.*; 

public class Password {
   public static void main(String[] args){
      String password = "";
      String corrPass = "";
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      try 
      {
         System.out.println("Enter the password to set: ");
         corrPass = br.readLine();
         corrPass = corrPass.trim();         
         
         while (password.equals(corrPass) == false)
         {
            System.out.println("Enter your password: ");
            password = br.readLine().trim();
         }
         
         System.out.println("Access granted!");
      }
      catch (IOException e) 
      {
      
      }
   }
}