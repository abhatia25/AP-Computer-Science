import java.util.Random;
import java.io.*;

public class HeadlessHorseman {

public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   public static void main(String[] args){
      ConsoleProgressBar x = new ConsoleProgressBar();
      Girls g = new Girls();
      Story s = new Story();
      Race r = new Race();
      
      x.Progress();
      s.Backstory();
      g.Like();
      Character c = s.Input();
      while (!c.equals('n')){ 
         g.Like();
         c = s.Input();
      }
      
      s.MoreStory();
      
      int score = r.ChaseObstacles();
      
      try
      {
         Thread.sleep(1000);
      }
      catch(InterruptedException ex)
      {
         Thread.currentThread().interrupt();
      }
      
      x.Progress();
      
      if (score > 0) {
         System.out.println("You escaped the headless horseman");
         System.out.println("Your final score is: " + score);
      }
      else {
         System.out.println("The headless horseman captured and killed you");
         System.out.println("Your final score is: " + score);
      }
   }      
}

