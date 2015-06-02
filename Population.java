public class Population
{
   //General Stats
   public int size; //Population size
   public int morale; //Morale
   public int food; //Food
   
   //Population Stats
   public int St; //Strength
   public int De; //Defense
   public int Sp; //Speed
   public int In; //Intelligence
   public int Ch; //Charisma
   public int DR; //Disease Resistance
   public int HE; //Hunting Efficiency
   
   //Traits/Skills/Adaptations
   public boolean PT; //Prehensile Tail - General
   public boolean Sw; //Swimming - Water related
   public boolean Di; //Digging - General
   public boolean Om; //Omnivore - Can eat more stuff
   public boolean OT; //Opposable Thumbs - General
   public boolean We; //Weapons - Attack related
   public boolean MI; //Musical Instruments - Morale related
   public boolean TF; //Thick Fur - Defense and Temperature related
   public boolean WP; //Well Prepared - Start with more food and population
   public boolean EC; //Extra Chromosome - More stat points

   public Population()
   {
      size = 100;
      morale = 50;
      food = 500;
   }
   
   public void PrintStats()
   {
      System.out.println("Population Size: " + size);
      System.out.println("Morale: " + morale); 
      System.out.println("Food: " + food);
      System.out.println("----------------------");
      System.out.println("Strength: " + St);
      System.out.println("Defense: " + De); 
      System.out.println("Speed: " + Sp);
      System.out.println("Intelligence: " + In);
      System.out.println("Charisma: " + Ch);
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
      if(OT == true)
         output = output + "Opposable Thumbs and ";
      if(We == true)
         output = output + "Weapons and "; 
      if(MI == true)
         output = output + "Musical Instruments and ";
      if(TF == true)
         output = output + "Thick Fur and ";
      if(WP == true)
         output = output + "Well Prepared and ";
      if(EC == true)
         output = output + "Extra Chromosome and ";  
         
      output = output.substring(0,(output.length() - 5));
      System.out.println(output);               
   }
}