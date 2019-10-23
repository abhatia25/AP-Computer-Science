/*
Aditya Bhatia
10/01/2019
Magpie Lab
 */
public class StringExplorer
{

   public static void main(String[] args)
       {
          String sample = "This is fun.";

              //  Demonstrate the indexOf method.
              int position = sample.indexOf("quick");
              System.out.println ("sample.indexOf(\"quick\") = " + position);

              //  Demonstrate the toLowerCase method.
              String lowerCase = sample.toLowerCase();
              System.out.println ("sample.toLowerCase() = " + lowerCase);
              System.out.println ("After toLowerCase(), sample = " + sample);

              //  Try other methods here:
              int notFoundPsn = sample.indexOf("slow");
              System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
      }

}