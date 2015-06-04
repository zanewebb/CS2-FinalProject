import java.util.*;
import java.io.*;

public class Event {
   private Random rng = new Random();
   private Scanner in = new Scanner(System.in);
   
   public void RunEvent(Population pop){
      int x = rng.nextInt(100)+1;
      if(x <= 5)//5%
         MysteryBerries(pop);
      else if(x > 5 && x <= 25)//20%
         Forest(pop);
      else if(x > 25 && x <= 35)//10%
         Attacked(pop);
      else if(x > 35 && x <= 45)//10%
         River(pop);
      else if(x > 45 && x <= 55)//10%
         Climb(pop);
      else if(x > 55 && x <= 65)//10%
         CatchDisease(pop);
      else if(x > 65 && x <= 75)//10%
         Trap(pop);
      else if(x > 75 && x <= 85)//10%
         ForestFire(pop);
      else if(x > 85 && x <= 90)//5%
         Accident(pop);
      else if(x > 90 && x <= 100)//10%
         CliffJump(pop);
   }
   
   public void MysteryBerries(Population pop){
      System.out.println("You come across mysterious berries");
      System.out.println("1. Eat");
      System.out.println("2. Don't Eat");
      int ans = 0;
      do{
         ans = in.nextInt();
         if(ans != 1 || ans != 2)
            System.out.println("Invalid");
      }while(ans != 1 || ans != 2);
      if(ans == 1){
         int x = rng.nextInt(1)+0; //50%
         if(x == 0){
            if(pop.DR >= 2){
               System.out.println("Your disease resistance helped you eat the berries successfully. You gained " + Math.round(5+(pop.size*0.15)) + " food.");
               pop.food += Math.round(5+(pop.size*0.15)); //add food to feed 15% of pop   
            }
            else {
               System.out.println("The berries were poisonous! You lost " + Math.round(5+pop.size*0.05) + " monkeys!");
               pop.size -= Math.round(5+pop.size*0.05); //5% dies
            }
         }
         else{
            System.out.println("You gained " + Math.round(5+(pop.size*0.15)) + " food.");
            pop.food += Math.round(5+(pop.size*0.15)); //add food to feed 15% of pop
         }
      }
      else{
         System.out.println("You ignore the berries and continue moving forward.");
      }
   }
   
   public void Forest(Population pop){
      System.out.println("You come across a forest area");
      System.out.println("1. Go Hunting");
      System.out.println("2. Reproduce");
      System.out.println("3. Continue Moving");
      int ans = 0;
      do{
         ans = in.nextInt();
         if(ans < 1 || ans > 4)
            System.out.println("Invalid");
      }while(ans < 1 || ans > 4);
      if(ans == 1){
         if(pop.Om == true){
            System.out.println("You gathered " + Math.round(pop.size*pop.HE*1.5) + " food (Omnivore Bonus)");
            pop.food += Math.round(pop.size*pop.HE*1.5);
         }
         else{
            System.out.println("You managed to gather " + Math.round(pop.size*pop.HE) + " food.");
            pop.food += Math.round(pop.size * pop.HE);
         }
      }
      else if(ans == 2){
         System.out.println("Your population doubled!");
         pop.size += pop.size;
      }
      else{
         System.out.println("You continue moving forward.");
      }
   }
   
   public void Attacked(Population pop){
      System.out.println("You are confronted by rival monkeys!");
      System.out.println("1. Fight");
      System.out.println("2. Run");
      int ans = 0;
      do{
         ans = in.nextInt();
         if(ans != 1 || ans != 2)
            System.out.println("Invalid");
      }while(ans != 1 || ans != 2);
      int pop2Sp = rng.nextInt(6)+1;
      int pop2At = rng.nextInt(6)+1;
      int pop2De = rng.nextInt(6)+1;
      if(ans == 1){
         if(pop.St > pop2De){
            System.out.println("You successfully killed the other monkeys!");
         }
         else if(pop.De > pop.St){
            System.out.println("You successfully defended against the other monkeys!");
         }
         else{
            System.out.println("Your monkeys were curb stomped. You lost " + Math.round(10+pop.size*0.3) +  " monkeys.");
            pop.size -= Math.round(10+pop.size*0.3);
         }
      }
      else{
         if(pop.Sp < pop2Sp){//if your monkeys are slower
            System.out.println("Your monkeys were too slow to escape. You lost " + Math.round(10+pop.size*0.3) +  " monkeys.");
            pop.size -= Math.round(10+pop.size*0.3);
         }
         else{
            System.out.println("You ran away succesfully. You continue moving forward.");
         }
      }
   }
   
   public void River(Population pop){
      System.out.println("You come across a river.");
      System.out.println("1. Build Raft");
      System.out.println("2. Ford River");
      System.out.println("3. Swim");
      int ans = 0;
      do{
         ans = in.nextInt();
         if(ans < 1 || ans > 3)
            System.out.println("Invalid");
      }while(ans < 1 || ans > 3);
      if(ans == 1){
         if(pop.In < 7){
            System.out.println("You were not smart enough to build a raft. You lost " + Math.round(10+(pop.size/4)) + " monkeys.");
            pop.size -= Math.round(10+(pop.size/4)); //lose 25% of pop
         }
         else
            System.out.println("You were smart enough to build a proper raft. You made it!");
      }
      else if(ans == 2){
         if(pop.Sp >= 6 && pop.St >= 6)
            System.out.println("You successfully forded the river.");
         else if(pop.Sp < 6 && pop.St < 6){
            System.out.println("Your monkeys were too slow and weak to ford the river. You lost " + Math.round(10+(pop.size/4)) + " monkeys.");
            pop.size -= Math.round(10+(pop.size/4));
         }
         else if(pop.Sp < 6){
            System.out.println("Your monkeys were too slow to ford the river. You lost " + Math.round(10+(pop.size/4)) + " monkeys.");
            pop.size -= Math.round(10+(pop.size/4));
         }
         else{
            System.out.println("Your monkeys were too weak to ford the river. You lost " + Math.round(10+(pop.size/4)) + " monkeys.");
            pop.size -= Math.round(10+(pop.size/4));
         }
      }
      else{
         if(pop.Sw == true){
            System.out.println("All your monkeys swam across the river successfully!");
         }
         else {
            System.out.println("Your monkeys can't swim! Lost " + Math.round(10+pop.size/2) + " monkeys.");
            pop.size -= Math.round(10+pop.size/2);
         }
      }
   }
   
   public void Climb(Population pop){
      System.out.println("You come across a cliff.");
      System.out.println("1. Climb up blindly");
      System.out.println("2. Find better climbing route");
      int ans = 0;
      do{
         ans = in.nextInt();
         if(ans != 1 || ans != 2)
            System.out.println("Invalid");
      }while(ans != 1 || ans != 2);
      if(ans == 1){
         if(pop.PT == true){
            System.out.println("Your monkeys climbed successfully!");
         }
         else {
            System.out.println("Your monkeys can't climb very well! Lost " + Math.round(10+pop.size*0.2) + " monkeys.");
            pop.size -= Math.round(10+pop.size*0.2);
         }
      }
      else if(ans == 2){
         if(pop.In > 8)
            System.out.println("You managed to find a safer route.");
         else{
            System.out.println("You failed to find a better route and lost " + Math.round(1+pop.size*0.05) + " monkeys.");
            pop.size -= Math.round(1+pop.size*0.05);
            Climb(pop);
         }
      }
   }
   
   public void CatchDisease(Population pop) {
      System.out.println("Your population has caught Neuromyelitis Optica.");
      int deathPercent = 10;
      deathPercent -= pop.DR;
      int size = pop.size;
      int dead = (int)(deathPercent * 2.5);
      pop.size -= dead;
      System.out.println(dead + " monkeys had complications, as a result, they went blind\n"
                        + "and walked off a cliff.");
      
   }
   
   public void Trap(Population pop) {
      int trapped = (int) (pop.size / rng.nextInt(pop.size));
      System.out.println(trapped + " monkeys got caught in a trap.");
      if(pop.In >= rng.nextInt(pop.In + 1))
         System.out.println("Congratulations your population is smart enough to free the\n"
                           + trapped + " monkeys.");
      else
         System.out.println("Your population was dumb enough to accidentally set off the traps\n"
                           + "killing " + trapped + " monkeys.");
   }
   
   public void ForestFire(Population pop) {
      System.out.println("One of the monkeys in your population accidentally started\n"
                        + "a forest fire.");
      int prevSize = pop.size;
      for(int i = 0; i < pop.size; i++) {
         if(rng.nextInt(pop.Sp + 1) == 0)
            pop.size--;
      }
      int died = prevSize - pop.size;
      System.out.println(died + " monkeys reenacted Pompeii.");
   }
   
   public void Accident(Population pop) {
      System.out.println("Come quickly, there's been a terrible accident.");
      pop.size--;
      System.out.println("One of the monkeys in your population suffered an aneurysm");
   }
   
   public void CliffJump(Population pop) {
      System.out.println("A wild CLIFF appears.");
      int prevSize = pop.size;
      for(int i = 0; i < pop.size; i++) {
         if(rng.nextInt(pop.Sp + 1) == 0)
            pop.size--;
      }
      int died = prevSize - pop.size;
      System.out.println(died + " monkeys fell off the cliff and\n"
                        + "severely bumped their heads.");
   }
}
