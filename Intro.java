import java.io.*;

class Intro {
   public static void main(String args[])
   {
      //Assignment 1
      for(int i = 0; i <= 5; i++){
         System.out.println("*****");
      }
      
      //Assignment 2
      int int1 = 10;
      int int2 = 10;
      float float1 = 12.5f;
      String string1 = "Java programming";
      System.out.println(int1);
      System.out.println(int2);
      System.out.println(float1);
      System.out.println(string1);
      
      //Assignment 3
      br();
   }
   static void br()
   {
      try {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter your name: ");
         String name = reader.readLine();
         System.out.println("Hello " + name + "!");
      } 
      catch (IOException ioe)
      {
      
      }
   }
}