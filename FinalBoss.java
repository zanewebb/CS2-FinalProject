import java.util.*;

public class FinalBoss
{
   private Population Pop = new Population();
   private Random rng = new Random();
   public boolean win;

   public FinalBoss(Population pop)
   {
      Pop = pop;
   }
   
   public void fight()
   {
      System.out.println("Oh no! There seems to be a radioactive gorilla in your way.");
      System.out.println("You have no choice but to fight the enraged beast to finish your journey.");
      System.out.println("-------------------------------------------------------------------------");
      
      //Keeps track of the body pile
      int deadSt = 0;
      int deadDe = 0;
      int deadSp = 0;
      int deadIn = 0;
      int deadDR = 0;
      int deadHE = 0;
      
      //Goes through each individual monkey to see which die
      for(int i = 0; i < Pop.size; i++)
      {
         int choice = rng.nextInt(6)+1;
         
         //Checks the strength of the monkeys
         if(choice == 1)
         {
            int bossSt = rng.nextInt(10)+2;
            if(bossSt >= Pop.St)
               deadSt++;
         }   
         
         //Checks the defense of the monkeys
         if(choice == 2)
         {
            int bossDe = rng.nextInt(10)+2;
            if(bossDe >= Pop.De)
               deadDe++;
         }
         
         //Checks the speed of the monkeys
         if(choice == 3)
         {
            int bossSp = rng.nextInt(10)+2;
            if(bossSp >= Pop.Sp)
               deadSp++;
         }
         
         //Checks the intelligence of the monkeys
         if(choice == 4)
         {
            int bossIn = rng.nextInt(10)+2;
            if(bossIn >= Pop.In)
               deadIn++;
         }
         
         //Checks the disease resistence of the monkeys
         if(choice == 5)
         {
            int bossDR = rng.nextInt(5)+1;
            if(bossDR >= Pop.DR)
               deadDR++;
         }
         
         //Checks the hunting efficiency of the monkeys
         if(choice == 6)
         {
            int bossHE = rng.nextInt(5)+1;
            if(bossHE >= Pop.HE)
               deadHE++;
         }
      }
      int dead = deadSt + deadDe + deadSp + deadIn + deadDR + deadHE;
      Pop.size -= dead;
      System.out.println("You have slain the feral beast, but at what cost?");
      System.out.println("A total of " + dead + " brave primates died fighting.");
      System.out.println(deadSt + " monkeys died because they were too weak.");
      System.out.println(deadDe + " monkeys died because they weren't durable.");
      System.out.println(deadSp + " monkeys died because they were too slow.");
      System.out.println(deadIn + " monkeys died because they were too stupid.");
      System.out.println(deadDR + " monkeys died because they succumbed to radiation poisoning.");
      System.out.println(deadHE + " monkeys died because they weren't able to find a good place to attack.");
      System.out.println("-------------------------------------------------------------------");
      
      if(Pop.size <= 0)
      {
         System.out.println("The entire populace was wiped out. The monkeys have gone extinct.");
         System.out.println("Game Over");
         win = false;
      }   
      if(Pop.size == 1)
      {
         System.out.println("Only one monkey remains. There is no way to repopulate the species. They are doomed to go extinct.");
         System.out.println("Game Over");
         win = false;
      }
      else
      {
         System.out.println("The population has survived and is able to reproduce.");
         System.out.println("You Win!");
         win = true;
      }
   }
   
   public boolean isWin(){
      return win;
   }
}