import java.util.Scanner;

public class Students {
   public static void main(String[] args){
      try {
         Scanner s = new Scanner(System.in);
         int students = 0;
         
         while (students != 25) {
            System.out.println("How many students in the room?");
            students = s.nextInt();
         }
         
         System.out.println("Class can start");}
      catch (Exception e){
      
      }
      
      /*int students = Input();
      for (int i = 0; i < 1;){
         if (students != 25) {
            students = Input();
         }
         else {
            System.out.println("Class can start");
            i++;
         }
      }*/
   }
   
   private static int Input(){
      Scanner s = new Scanner(System.in);
      System.out.println("How many students in the room?");
      int student = s.nextInt();
      return student;
   }
}