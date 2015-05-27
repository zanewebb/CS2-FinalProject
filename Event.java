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
   
   }
   
   public static void Forest(){
   //B
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
      int prevSize = Population.size;
      for(int i = 0; i < Population.size; i++) {
         if(rng.nextInt(Population.Sp) == 0)
            Population.size--;
      }
      int died = prevSize - Population.size;
      System.out.println(died + " monkeys reenacted Pompeii.");
   }
   
   public static void Accident(){
      Population.size--;
      System.out.println("One of the monkeys in your population suffered an aneurysm");
   }
   
   public static void CliffJump(){
      int prevSize = Population.size;
      for(int i = 0; i < Population.size; i++) {
         if(rng.nextInt(Population.Sp) == 0)
            Population.size--;
      }
      int died = prevSize - Population.size;
      System.out.println(died + " monkeys fell off the cliff and\n"
                        + "severely bumped their heads.");
   }
}