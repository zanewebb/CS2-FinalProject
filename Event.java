import java.util.*;
import java.io.*;
public class Event {
   static Random rng = new Random();
   static Scanner in = new Scanner(System.in);
   public static void RunEvent(){//B
      int x = rng.nextInt(100)+1;
      if(x <= 5)//5%
         MysteryBerries();
      else if(x > 5 && x <= 25)//20%
         Forest();
      else if(x > 25 && x <= 35)//10%
         Attacked();
      else if(x > 35 && x <= 45)//10%
         River();
      else if(x > 45 && x <= 55)//10%
         Climb();
      else if(x > 55 && x <= 65)//10%
         CatchDisease();
      else if(x > 65 && x <= 75)//10%
         Trap();
      else if(x > 75 && x <= 85)//10%
         ForestFire();
      else if(x > 85 && x <= 90)//5%
         Accident();
      else if(x > 90 && x <= 100)//10%
         CliffJump();
   }
   
   public static void MysteryBerries(){
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
            if(DR >= 2){
               System.out.println("Your disease resistance helped you eat the berries successfully. You gained " + (pop.size*0.15) + " food.");
               food += (pop.size*0.15); //add food to feed 15% of pop   
            }
            else {
               System.out.println("The berries were poisonous! You lost " + (pop.size*0.05) + " monkeys!");
               pop.size = pop.size - (pop.size*0.05); //5% dies
            }
         }
         else{
            System.out.println("You gained " + (pop.size*0.15) + " food.");
            food += (pop.size*0.15); //add food to feed 15% of pop
         }
      }
      else{
         System.out.println("You ignore the berries and continue moving forward.");
      }
   }
   
   public static void Forest(){
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
         if(Om == true){
            System.out.println("You gathered " + pop.size*pop.HE*1.5 + " food (Omnivore Bonus)");
            food += pop.size*pop.HE*1.5;
         }
         else{
            System.out.println("You managed to gather " + pop.size*pop.HE + " food.");
            food += pop.size * pop.HE;
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
   
   public static void Attacked(){
      System.out.println("You are confronted by rival monkeys!");
      System.out.println("1. Fight");
      System.out.println("2. Run");
      int ans = 0;
      do{
         ans = in.nextInt();
         if(ans != 1 || ans != 2)
            System.out.println("Invalid");
      }while(ans != 1 || ans != 2);
      Population pop2 = new Population();//generate rival monkeys
      if(ans == 1){
         //fight
      }
      else{
         if(pop.Sp < pop2.Sp){//if your monkeys are slower
            //fight
         }
         else{
            System.out.println("You ran away succesfully. You continue moving forward.");
         }
      }
   }
   
   public static void River(){
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
            System.out.println("You were not smart enough to build a raft. You lost " + (pop.size/4) + " monkeys.");
            pop.size -= (pop.size/4); //lose 25% of pop
         }
         else
            System.out.println("You were smart enough to build a proper raft. You made it!");
      }
      else if(ans == 2){
         if(pop.Sp >= 6 && pop.St >= 6)
            System.out.println("You successfully forded the river.");
         else if(pop.Sp < 6 && pop.St < 6)
            System.out.println("Your monkeys were too slow and weak to ford the river.");
         else if(pop.Sp < 6)
            System.out.println("Your monkeys were too slow to ford the river.");
         else
            System.out.println("Your monkeys were too weak to ford the river.");
      }
      else{
         if(Sw == true){
            System.out.println("All your monkeys swam across the river successfully!");
         }
         else {
            System.out.println("Your monkeys can't swim! Lost " + pop.size/2 + " monkeys.");
            pop.size -= (pop.size/2);
         }
      }
   }
   
   public static void Climb(){
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
         //add using adaptation
      }
      else if(ans == 2){
         if(pop.In > 8)
            System.out.println("You managed to find a safer route.");
         else{
            System.out.println("You failed to find a better route and lost " + (pop.size*0.05) + " monkeys.");
            pop.size -= (pop.size*0.05);
            Climb();
         }
      }
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
