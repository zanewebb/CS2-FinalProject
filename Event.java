import java.util.*;
import java.io.*;
public class Event {
   Random rng = new Random();
   Scanner in = new Scanner(System.in);
   public static void RunEvent(){
   //randomly picks event to run
   //B
   }
   
   public static void MysteryBerries(){
      //B
      System.out.println("You come across mysterious berries");
      System.out.println("1. Eat");
      System.out.println("2. Don't Eat");
      do{
         int ans = in.nextInt();
         if(ans != 1 || ans != 2)
            System.out.println("Invalid");
      }while(ans != 1 || ans != 2);
      if(ans == 1){
         int x = rng.nextInt(1)+0; //50%
         if(x == 0){
            System.out.println("The berries were poisonous! You lost " + (pop.size/5) + " monkeys!");
            pop.size = pop.size - (pop.size/5); //5% dies
         }
         else(){
            System.out.println("You gained " + (pop.size/15) + " food.");
            food += (pop.size/15); //add food to feed 15% of pop
         }
   }
   
   public static void Forest(){
      //B
      System.out.println("You come across a forest area");
      System.out.println("1. Go Hunting");
      System.out.println("2. Rest");
      System.out.println("3. Reproduce");
      System.out.println("4. Continue Moving");
      do{
         int ans = in.nextInt();
         if(ans < 1 || ans > 4)
            System.out.println("Invalid");
      }while(ans < 1 || ans > 4);
      if(ans == 1){
         food += pop.size * pop.HE;
      }
   }
   
   public static void Attacked(){
   //B
   }
   
   public static void River(){
   //B
   }
   
   public static void Climb(){
   //B
   }
   
   public static void CatchDisease(){
   //N
   }
   
   public static void Trap(){
   //N
   }
   
   public static void ForestFire(){
   //N
   }
   
   public static void Accident(){
   //N
   }
   
   public static void CliffJump(){
   //N
   }
}