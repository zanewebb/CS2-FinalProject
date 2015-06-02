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
   
   public static void CatchDisease() {
      System.out.println("Your population has caught Neuromyelitis Optica.");
      int deathPercent = 10;
      deathPercent-= Population.DR;
      int size = Population.size();
      int dead = (int)(deathPercent * 2.5);
      Population.size() -= dead;
      System.out.println(dead + " monkeys had complications, as a result, they went blind\n"
                        + "and walked off a cliff.");
      
   }
   
   public static void Trap() {
      int trapped = (int) (Population.size / rng.nextInt(Population.size));
      System.out.println(trapped + " monkeys got caught in a trap.");
      if(Population.In >= rng.nextInt(Population.In + 1))
         System.out.println("Congratulations your population is smart enough to free the\n"
                           + trapped + " monkeys.");
      else
         System.out.println("Your population was dumb enough to accidentally set off the traps\n"
                           + "killing " + trapped + " monkeys.");
   }
   
   public static void ForestFire() {
      System.out.println("One of the monkeys in your population accidentally started\n"
                        + "a forest fire.");
      int prevSize = Population.size;
      for(int i = 0; i < Population.size; i++) {
         if(rng.nextInt(Population.Sp + 1) == 0)
            Population.size--;
      }
      int died = prevSize - Population.size;
      System.out.println(died + " monkeys reenacted Pompeii.");
   }
   
   public static void Accident() {
      System.out.println("Come quickly, there's been a terrible accident.");
      Population.size--;
      System.out.println("One of the monkeys in your population suffered an aneurysm");
   }
   
   public static void CliffJump() {
      System.out.println("A wild CLIFF appears.");
      int prevSize = Population.size;
      for(int i = 0; i < Population.size; i++) {
         if(rng.nextInt(Population.Sp + 1) == 0)
            Population.size--;
      }
      int died = prevSize - Population.size;
      System.out.println(died + " monkeys fell off the cliff and\n"
                        + "severely bumped their heads.");
   }
}
