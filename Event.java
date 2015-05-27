import java.util.*;
import java.io.*;
public class Event {
   static Random rng = new Random();
   static Scanner in = new Scanner(System.in);
   public static void RunEvent(){
   //randomly picks event to run
   //B
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
            System.out.println("The berries were poisonous! You lost " + (pop.size/5) + " monkeys!");
            pop.size = pop.size - (pop.size/5); //5% dies
         }
         else{
            System.out.println("You gained " + (pop.size/15) + " food.");
            food += (pop.size/15); //add food to feed 15% of pop
         }
      }
      else{
         System.out.println("You ignore the berries and continue moving forward.");
      }
   }
   
   public static void Forest(){
      System.out.println("You come across a forest area");
      System.out.println("1. Go Hunting");
      System.out.println("2. Rest");
      System.out.println("3. Reproduce");
      System.out.println("4. Continue Moving");
      int ans = 0;
      do{
         ans = in.nextInt();
         if(ans < 1 || ans > 4)
            System.out.println("Invalid");
      }while(ans < 1 || ans > 4);
      if(ans == 1){
         System.out.println("You managed to gather " + pop.size*pop.HE + " food.");
         food += pop.size * pop.HE;
      }
      else if(ans == 2){
         //rest
      }
      else if(ans == 3){
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
      //System.out.println("3. Swim");
      int ans = 0;
      do{
         ans = in.nextInt();
         if(ans != 1 || ans != 2)
            System.out.println("Invalid");
      }while(ans != 1 || ans != 2);
      if(ans == 1){
         if(pop.In < 7){
            System.out.println("You were not smart enough to build a raft. You lost " + (pop.size/4) + " monkeys.");
            pop.size -= (pop.size/4); //lose 25% of pop
         }
         else
            System.out.println("You were smart enough to build a proper raft. You made it!");
      }
      else{
         if(pop.Sp >= 6 && pop.St >= 6)
            System.out.println("You successfully forded the river.");
         else if(pop.Sp < 6 && pop.St < 6)
            System.out.println("Your monkeys were too slow and weak to ford the river.");
         else if(pop.Sp < 6)
            System.out.println("Your monkeys were too slow to ford the river.");
         else
            System.out.println("Your monkeys were too weak to ford the river.");
      }
      //add swim option
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