public class PopulationTester
{
   public static void main(String[] args)
   {
      Population pop = new Population();
      
      pop.PrintStats();
      
      System.out.println();
      pop.EC = true;
      pop.TF = true;
      pop.PrintTraits();
      System.out.println();
      
      pop.size = 2;
      pop.St = 5;
      pop.Sp = 10;
      pop.Ch = 1;
      pop.DR = 10;
      pop.PrintStats();
   }
}