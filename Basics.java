public class Basics {
   public static void main(String[] args){
      //Info("John", 11, 16, "10/20/2001");
      Me("Aditya", 4.3125f, "Burger and Fries");
   }
   static void Info(String name, int grade, int age, String bday)
   {
      System.out.println("Name: " + name);
      System.out.println("Grade: " + grade);
      System.out.println("Age: " + age);
      System.out.println("Birthday: " + bday);
   }
   static void Me(String name, float gpa, String meal)
   {
      System.out.println("Name: " + name);
      System.out.println("GPA: " + gpa);
      System.out.println("Favorite Meal: " + meal);
   }
}