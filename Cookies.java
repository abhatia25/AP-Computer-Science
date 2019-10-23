/* Aditya Bhatia
10/11/2019
Cookie Recipe*/
import java.io.*;

public class Cookies {
   public static int cookies = 0;
   
   public static void main(String[] args){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double butter = 1.0/24.0;
      double whiteSugar = 1.0/24.0;
      double brownSugar = 10./24.0;
      double eggs = 2.0/24.0;
      double vanillaExtract = 2.0/24.0;
      double bakingSoda = 1.0/24.0;
      double hotWater = 2.0/24.0;
      double salt = 0.5/24.0;
      double flour = 3.0/24.0;
      double chocolateChips = 2.0/24.0;
      
      double butterFinal = 0;
      double whiteSugarFinal = 0;
      double brownSugarFinal = 0;
      double eggsFinal = 0;
      double vanillaExtractFinal = 0;
      double bakingSodaFinal = 0;
      double hotWaterFinal = 0;
      double saltFinal = 0;
      double flourFinal = 0;
      double chocolateChipsFinal = 0;
      
      while (cookies == 0){
         try {
            System.out.println("How many cookies?");
            cookies = Integer.parseInt(br.readLine());
         }
         catch (Exception e){
            System.out.println("Please enter in an integer value");
         }      
       }
      
      for (int i = 0; i <= cookies; i++){
         butterFinal += butter;
         whiteSugarFinal += whiteSugar;
         brownSugarFinal += brownSugar;
         eggsFinal += eggs;
         vanillaExtractFinal += vanillaExtract;
         bakingSodaFinal += bakingSoda;
         hotWaterFinal += hotWater;
         saltFinal += salt;
         flourFinal += flour;
         chocolateChipsFinal += chocolateChips;
      }
      
      System.out.println("Butter: " +  butterFinal + " cups");
      System.out.println("White Sugar: " + whiteSugarFinal + " cups");
      System.out.println("Brown Sugar: " + brownSugarFinal + " cups");
      System.out.println("Eggs: " + eggsFinal + " eggs");
      System.out.println("Vanilla Extract: " + vanillaExtractFinal + " teaspoons");
      System.out.println("Baking Soda: " + bakingSodaFinal + " teaspoons");
      System.out.println("Hot Water: " + hotWaterFinal + " teaspoons");
      System.out.println("Salt: " + saltFinal + " teaspoons");
      System.out.println("Flour: " + flourFinal + " cups");
      System.out.println("Chocolate Chips: " + chocolateChipsFinal + " cups");
   }
}