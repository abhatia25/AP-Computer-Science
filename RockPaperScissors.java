import java.lang.Math;
import java.util.Scanner;

public class RockPaperScissors 
{
   public static void main(String[] args)
   {
      String computerMove = ComputerMove();
      String playerMove = PlayerMove();
      CheckMoves(computerMove, playerMove);
   }
   
   private static String ComputerMove()
   {
      int i = ((int) (Math.random() * 3));
      String compMove = "";
      switch (i)
      {
         case 0:
            compMove = "Rock";
            break;
         case 1:
            compMove = "Paper";
            break;
         case 2:
            compMove = "Scissors";
            break;
      }
      return compMove.toLowerCase();
   }
   
   private static String PlayerMove()
   {
      Scanner sc = new Scanner(System.in);
      String pMove = sc.nextLine();
      pMove = pMove.toLowerCase();
      return pMove;
   }
   
   private static void CheckMoves(String cMove, String pMove)
   {
      if(cMove.equals(pMove))
      {
         System.out.println("Tie!");
      }
      else if (cMove == "rock" && pMove == "paper")
      {
         System.out.println("You Win!");
      }
      else if (cMove == "paper" && pMove == "rock")
      {
         System.out.println("Computer Wins!");
      }
      else if (cMove == "scissors" && pMove == "paper")
      {
         System.out.println("Computer Wins!");
      }
      else if (cMove == "paper" && pMove == "scissors")
      {
         System.out.println("You Win!");
      }
      else if (cMove == "rock" && pMove == "scissors")
      {
         System.out.println("Computer Wins!");
      }
      else if (cMove == "scissors" && pMove == "rock")
      {
         System.out.println("You Win!");
      }
   }
}