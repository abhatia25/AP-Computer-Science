import java.util.Arrays;
import java.util.Scanner;

public class ArraysProgram {
   public static void main(String[] args){
      String[] students = {"Rushil", "Aditya", "Vincent", "Ben", "Mustafa"};
      
      Arrays.sort(students);
      
      for (String student : students) {
         if (Arrays.binarySearch(students, student) == 3){
            System.out.println(student);
         }
      }
      
      Scanner input = new Scanner(System.in);
      String in[];
      in = new String[12];
      
      for (int i = 0; i < 12; i++){
         System.out.println("Enter in the " + (i+1) + " element of the array");
         in[i] = input.nextLine();
      }
      System.out.println("The 4th element of the array is " + in[4]);
   }
}