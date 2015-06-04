public class Population
{
   //General Stats
   public int size; //Population size
   public int food; //Food
   
   //Population Stats
   public int St; //Strength
   public int De; //Defense
   public int Sp; //Speed
   public int In; //Intelligence
   public int DR; //Disease Resistance
   public int HE; //Hunting Efficiency
   
   //Traits/Skills/Adaptations
   public boolean PT; //Prehensile Tail - General
   public boolean Sw; //Swimming - Water related
   public boolean Di; //Digging - General
   public boolean Om; //Omnivore - Can eat more stuff
   public boolean WP; //Well Prepared - Start with more food and population
   public boolean EC; //Extra Chromosome - More stat points
   public int extraPoints;
   public int evPoints;
   
   public Population()
   {
      size = 100;
      food = 500;
      extraPoints = 6;
      evPoints = 2;
      
      St = 5;
      De = 5;
      Sp = 5;
      In = 5;
      DR = 2;
      HE = 2;
      
      PT = false;
      Sw = false;
      Di = false;
      Om = false;
      WP = false;
      EC = false;
   }
   
   public void PrintStats()
   {
      System.out.println("Population Size: " + size);
      System.out.println("Food: " + food);
      System.out.println("----------------------");
      System.out.println("Strength: " + St);
      System.out.println("Defense: " + De); 
      System.out.println("Speed: " + Sp);
      System.out.println("Intelligence: " + In);
      System.out.println("Disease Resistance: " + DR);
      System.out.println("Hunting Efficiency: " + HE);
   }
   
   public void PrintTraits()
   {
      String output = "Your population has the traits: ";
      if(PT == true)
         output = output + "Prehensile Tail and ";
      if(Sw == true)
         output = output + "Swimming and ";
      if(Di == true)
         output = output + "Digging and "; 
      if(Om == true)
         output = output + "Omnivore and "; 
      if(WP == true)
         output = output + "Well Prepared and ";
      if(EC == true)
         output = output + "Extra Chromosome and ";  
         
      output = output.substring(0,(output.length() - 5));
      System.out.println(output);               
   }
}