import java.io.*; 
import java.util.Arrays; 
import java.lang.*;

public class Ciphers {
   public static void main(String[] args){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      char[] alphabet = new char[]{'a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
      
      try 
      {
         System.out.print("Enter text to encode: ");
         String plainText = br.readLine();
         for (int i = 0; i < plainText.length(); i++){
            char c = plainText.charAt(i);
            if (c != ' ')
            {
               int p = Arrays.binarySearch(alphabet, c);
               char x = alphabet[(p+3) % 26];
               plainText = plainText.replace(c, x);  
            }
            else 
            {
               plainText =  plainText.replace(' ', ' ');
            }
         }
      
         String cipherText = plainText;
         System.out.println("Encrypted text: " + cipherText);
      }
      catch (IOException e) 
      {
      
      }
   }
}