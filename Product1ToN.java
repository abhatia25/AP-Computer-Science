public class Product1ToN {
   public static void main(String[] args){
      // Define variables
      long product = 1;      // The accumulated product, init to 1
      int lowerbound = 1;
      int upperbound = 14;
      
      for(int i = lowerbound; i <= upperbound; i++){
         product *= i;
      }
      
      System.out.println("Product: " + product);
   }
}