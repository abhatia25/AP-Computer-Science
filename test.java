import java.io.*;  
import java.util.Arrays;

class test {
   public static String fileDirectory = "C:/";
   
   public static void main(String args[])
   {
      File downloads = new File(fileDirectory);    
      File[] listOfFiles = downloads.listFiles();
      Arrays.sort(listOfFiles);
      for (int i = 0; i < listOfFiles.length; i++) {
          System.out.println(listOfFiles[i]);
      }
   }    
}