import java.util.Scanner;

public class StudentsArray {
   public static void main(String[] args){
      String[][] students = {{"joe", "timmy", "bill", "tom", "john"}, {"beth", "olivia", "marie", "kyle", "ben"}};
      
      Scanner s = new Scanner(System.in);
      
      System.out.println("Please enter in the name of the student you want to find");
      
      String student = s.nextLine();
      
      for(int r = 0; r < students.length; r++){
         for(int c = 0; c < students[r].length; c++){
            if(student.equals(students[r][c])){
               r++;
               c++;
               System.out.println(student + " is assigned to the seat in row " + r + " and column " + c);
               break;
            }
         }
      }
   }
}