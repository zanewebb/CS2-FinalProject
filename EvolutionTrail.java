import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class EvolutionTrail extends Applet implements MouseListener
{
      Population pop = new Population();
      int xpos;
      int ypos;
      
      int posRect1xco,posRect1yco,posRect1width,posRect1height;
      int negRect1xco,negRect1yco,negRect1width,negRect1height;
      int posRect2xco,posRect2yco,posRect2width,posRect2height;
      int negRect2xco,negRect2yco,negRect2width,negRect2height;
      int posRect3xco,posRect3yco,posRect3width,posRect3height;
      int negRect3xco,negRect3yco,negRect3width,negRect3height;
      int posRect4xco,posRect4yco,posRect4width,posRect4height;
      int negRect4xco,negRect4yco,negRect4width,negRect4height;
      int posRect5xco,posRect5yco,posRect5width,posRect5height;
      int negRect5xco,negRect5yco,negRect5width,negRect5height;
      int posRect6xco,posRect6yco,posRect6width,posRect6height;
      int negRect6xco,negRect6yco,negRect6width,negRect6height;
      int nextButtonxco,nextButtonyco,nextButtonWidth,nextButtonHeight;
      
      boolean posRect1Clicked = false;
      boolean negRect1Clicked = false;
      boolean posRect2Clicked = false;
      boolean negRect2Clicked = false;
      boolean posRect3Clicked = false;
      boolean negRect3Clicked = false;
      boolean posRect4Clicked = false;
      boolean negRect4Clicked = false;
      boolean posRect5Clicked = false;
      boolean negRect5Clicked = false;
      boolean posRect6Clicked = false;
      boolean negRect6Clicked = false;
      
      boolean mouseEntered;
      
      int room; //This determines which screen is showing (0 = Title screen 1 = Stats, 2 = Ev Traits,
      
      public void init()
      {
         room = 1; //change to 0 once we get a title card
         
         posRect1xco = 270;
         posRect1yco = 30; 
         posRect1width = 20; 
         posRect1height = 20;
         negRect1xco = 300; 
         negRect1yco = 30; 
         negRect1width = 20; 
         negRect1height = 20;
         
         posRect2xco = 270; 
         posRect2yco = 90; 
         posRect2width = 20; 
         posRect2height = 20;
         negRect2xco = 300; 
         negRect2yco = 90; 
         negRect2width = 20; 
         negRect2height = 20;
         
         posRect3xco = 270; 
         posRect3yco = 150; 
         posRect3width = 20; 
         posRect3height = 20;
         negRect3xco = 300; 
         negRect3yco = 150; 
         negRect3width = 20; 
         negRect3height = 20;
         
         posRect4xco = 270; 
         posRect4yco = 210; 
         posRect4width = 20; 
         posRect4height = 20;
         negRect4xco = 300; 
         negRect4yco = 210; 
         negRect4width = 20; 
         negRect4height = 20;
         
         posRect5xco = 270; 
         posRect5yco = 270; 
         posRect5width = 20; 
         posRect5height = 20;
         negRect5xco = 300; 
         negRect5yco = 270; 
         negRect5width = 20; 
         negRect5height = 20;
         
         posRect6xco = 270; 
         posRect6yco = 330; 
         posRect6width = 20; 
         posRect6height = 20;
         negRect6xco = 300; 
         negRect6yco = 330; 
         negRect6width = 20; 
         negRect6height = 20;
         
         nextButtonxco = 270;
         nextButtonyco = 372;
         nextButtonWidth = 50;
         nextButtonHeight = 20;
      
         addMouseListener(this);
      } 
     
      /*
         Create a method for the beginning of the game
         where you can click buttons to add to your stats.
         Also, be able to choose your two traits for your
         population. Possibly make this a different screen 
         where it has a list of them and maybe a short description.
      */
      
      public void paint(Graphics g)
      {
         if(room == 0){
            //paint some sort of title screen
         }
         if(room == 1){
            g.setColor(Color.blue);
            
            g.fillRect(posRect1xco,posRect1yco,posRect1width,posRect1height);
            g.fillRect(posRect2xco,posRect2yco,posRect2width,posRect2height);
            g.fillRect(posRect3xco,posRect3yco,posRect3width,posRect3height);
            g.fillRect(posRect4xco,posRect4yco,posRect4width,posRect4height);
            g.fillRect(posRect5xco,posRect5yco,posRect5width,posRect5height);
            g.fillRect(posRect6xco,posRect6yco,posRect6width,posRect6height);
            
            g.setColor(Color.red);
            
            g.fillRect(negRect1xco,negRect1yco,negRect1width,negRect1height);
            g.fillRect(negRect2xco,negRect2yco,negRect2width,negRect2height);
            g.fillRect(negRect3xco,negRect3yco,negRect3width,negRect3height);
            g.fillRect(negRect4xco,negRect4yco,negRect4width,negRect4height);
            g.fillRect(negRect5xco,negRect5yco,negRect5width,negRect5height);
            g.fillRect(negRect6xco,negRect6yco,negRect6width,negRect6height);
            
            g.setColor(Color.gray);
            g.fillRect(nextButtonxco,nextButtonyco,nextButtonWidth,nextButtonHeight);
            
            g.setColor(Color.yellow);
            
            for(int i = 0; i < 6; i++){
               g.drawString("-", 306, 44+60*i);
               g.drawString("+", 276, 44+60*i);
            } 
            
            g.setColor(Color.black);
            
            g.drawString("PICK YOUR STATS", 150, 15);
            g.drawString("Next", 282, 386);
            
            g.drawString("Strength: " + pop.St, 60, 50);
            g.drawString("Defense: " + pop.De, 60, 110);
            g.drawString("Speed: " + pop.Sp, 60, 170);
            g.drawString("Intelligence: " + pop.In, 60, 230);
            g.drawString("Disease Resistance: " + pop.DR, 60, 290);
            g.drawString("Hunting Efficiency: " + pop.HE, 60, 350);
            g.drawString("Extra Points: " + pop.extraPoints, 60, 386);
         //this should probably go somewhere else
            if(posRect1Clicked == true && pop.extraPoints > 0 && pop.St < 10){
                  pop.St++;
                  pop.extraPoints--;
            }
            if(negRect1Clicked == true && pop.St > 0){
                  pop.St--;
                  pop.extraPoints++;
            }
            if(posRect2Clicked == true && pop.extraPoints > 0 && pop.De < 10){
                  pop.De++;
                  pop.extraPoints--;
            }
            if(negRect2Clicked == true && pop.De > 0){
                  pop.De--;
                  pop.extraPoints++;
            }
            if(posRect3Clicked == true && pop.extraPoints > 0 && pop.Sp < 10){
                  pop.Sp++;
                  pop.extraPoints--;
            }
            if(negRect3Clicked == true && pop.Sp > 0){
                  pop.Sp--;
                  pop.extraPoints++;
            }
            if(posRect4Clicked == true && pop.extraPoints > 0 && pop.In < 10){
                  pop.In++;
                  pop.extraPoints--;
            }
            if(negRect4Clicked == true && pop.In > 0){
                  pop.In--;
                  pop.extraPoints++;
            }
            if(posRect5Clicked == true && pop.extraPoints > 0 && pop.DR < 5){
                  pop.DR++;
                  pop.extraPoints--;
            }
            if(negRect5Clicked == true && pop.DR > 0){
                  pop.DR--;
                  pop.extraPoints++;
            }
            if(posRect6Clicked == true && pop.extraPoints > 0 && pop.HE < 5){
                  pop.HE++;
                  pop.extraPoints--;
            }
            if(negRect6Clicked == true && pop.HE > 0){
                  pop.HE--;
                  pop.extraPoints++;
            }
         }
         else if(room == 2){
            g.setColor(Color.gray);//reusing prev rectangles to save space
            g.fillRect(nextButtonxco,nextButtonyco,nextButtonWidth,nextButtonHeight);
            g.fillRect(negRect1xco,negRect1yco+10,negRect1width,negRect1height);
            g.fillRect(negRect2xco,negRect2yco+10,negRect2width,negRect2height);
            g.fillRect(negRect3xco,negRect3yco+10,negRect3width,negRect3height);
            g.fillRect(negRect4xco,negRect4yco+10,negRect4width,negRect4height);
            g.fillRect(negRect5xco,negRect5yco+10,negRect5width,negRect5height);
            
            g.setColor(Color.black);
            g.drawString("PICK YOUR EVOLUTION TRAITS", 125, 15);
            g.drawString("Next", 282, 386);
            
            g.drawString("Prehensile Tail", 60, 50);
            g.drawString("Makes your monkeys better at climbing.", 75, 80);
            g.drawString("Swimming", 60, 110);
            g.drawString("Cross rivers easier.", 75, 140);
            g.drawString("Omnivore", 60, 170);
            g.drawString("Collect more food when hunting.", 75, 200);
            g.drawString("Well Prepared", 60, 230);
            g.drawString("Start with more food and population.", 75, 260);
            g.drawString("Extra Chromosome", 60, 290);
            g.drawString("Gives you more stat points to use.", 75, 320);
            g.drawString("Traits Left: " + pop.evPoints, 60, 386);
            
            if(negRect1Clicked == true){ //for some reason, this doesn't work as intended.
               if(pop.PT == false && pop.evPoints > 0){
                  pop.evPoints--;
                  pop.PT = true;
                  g.setColor(Color.yellow);
                  g.fillRect(negRect1xco,negRect1yco+10,negRect1width,negRect1height);
               }
               else if(pop.PT == true && pop.evPoints < 2){
                  pop.evPoints++;
                  pop.PT = false;
                  g.setColor(Color.gray);
                  g.fillRect(negRect1xco,negRect1yco+10,negRect1width,negRect1height);
               }
            }
         }
      }
      
      /*
         Create a method that randomly chooses which
         event happens when you go to the next screen.
         Make some events more likely than others
         like the clearing and small traps. 
         (Most likely nested inside the "room 3" if statement)
      */
      
      /*
         Need to make a boss/big end game event to
         test the player's population and see if they
         survive. 
      */
      
      public void mousePressed (MouseEvent me) 
      {
         xpos = me.getX();
         ypos = me.getY();
         if(room == 1){
            if (xpos>posRect1xco && xpos<posRect1xco + posRect1width && ypos>posRect1yco && ypos<posRect1yco + posRect1height)  
               posRect1Clicked = true; 
            else   
               posRect1Clicked = false;
               
            if (xpos>negRect1xco && xpos<negRect1xco + negRect1width && ypos>negRect1yco && ypos<negRect1yco + negRect1height)  
               negRect1Clicked = true; 
            else   
               negRect1Clicked = false;  
            
            if (xpos>posRect2xco && xpos<posRect2xco + posRect2width && ypos>posRect2yco && ypos<posRect2yco + posRect2height)  
               posRect2Clicked = true; 
            else   
               posRect2Clicked = false;
               
            if (xpos>negRect2xco && xpos<negRect2xco + negRect2width && ypos>negRect2yco && ypos<negRect2yco + negRect2height)  
               negRect2Clicked = true; 
            else   
               negRect2Clicked = false;
            
            if (xpos>posRect3xco && xpos<posRect3xco + posRect3width && ypos>posRect3yco && ypos<posRect3yco + posRect3height)  
               posRect3Clicked = true; 
            else   
               posRect3Clicked = false;
               
            if (xpos>negRect3xco && xpos<negRect3xco + negRect3width && ypos>negRect3yco && ypos<negRect3yco + negRect3height)  
               negRect3Clicked = true; 
            else   
               negRect3Clicked = false; 
            
            if (xpos>posRect4xco && xpos<posRect4xco + posRect4width && ypos>posRect4yco && ypos<posRect4yco + posRect4height)  
               posRect4Clicked = true; 
            else   
               posRect4Clicked = false;
               
            if (xpos>negRect4xco && xpos<negRect4xco + negRect4width && ypos>negRect4yco && ypos<negRect4yco + negRect4height)  
               negRect4Clicked = true; 
            else   
               negRect4Clicked = false;    
            
            if (xpos>posRect5xco && xpos<posRect5xco + posRect5width && ypos>posRect5yco && ypos<posRect5yco + posRect5height)  
               posRect5Clicked = true; 
            else   
               posRect5Clicked = false;
               
            if (xpos>negRect5xco && xpos<negRect5xco + negRect5width && ypos>negRect5yco && ypos<negRect5yco + negRect5height)  
               negRect5Clicked = true; 
            else   
               negRect5Clicked = false;   
            
            if (xpos>posRect6xco && xpos<posRect6xco + posRect6width && ypos>posRect6yco && ypos<posRect6yco + posRect6height)  
               posRect6Clicked = true; 
            else   
               posRect6Clicked = false;
               
            if (xpos>negRect6xco && xpos<negRect6xco + negRect6width && ypos>negRect6yco && ypos<negRect6yco + negRect6height)  
               negRect6Clicked = true; 
            else   
               negRect6Clicked = false;             
            if (xpos>nextButtonxco && xpos<nextButtonxco+nextButtonWidth && ypos>nextButtonyco && ypos<nextButtonyco+nextButtonHeight)
               room++;
         }
         
         else if(room == 2){
            if (xpos>negRect1xco && xpos<negRect1xco + negRect1width && ypos>negRect1yco+10 && ypos<negRect1yco+10 + negRect1height)  
               negRect1Clicked = true; 
            else   
               negRect1Clicked = false;  
            
            if (xpos>negRect2xco && xpos<negRect2xco + negRect2width && ypos>negRect2yco+10 && ypos<negRect2yco+10 + negRect2height)  
               negRect2Clicked = true; 
            else   
               negRect2Clicked = false;
            
            if (xpos>negRect3xco && xpos<negRect3xco + negRect3width && ypos>negRect3yco+10 && ypos<negRect3yco+10 + negRect3height)  
               negRect3Clicked = true; 
            else   
               negRect3Clicked = false; 
               
            if (xpos>negRect4xco && xpos<negRect4xco + negRect4width && ypos>negRect4yco+10 && ypos<negRect4yco+10 + negRect4height)  
               negRect4Clicked = true; 
            else   
               negRect4Clicked = false;             
               
            if (xpos>negRect5xco && xpos<negRect5xco + negRect5width && ypos>negRect5yco+10 && ypos<negRect5yco+10 + negRect5height)  
               negRect5Clicked = true; 
            else   
               negRect5Clicked = false;
         }      
         repaint();
         me.consume();            
      }
       
      public void mouseEntered (MouseEvent me) {} 
      public void mouseClicked (MouseEvent me) {} 
      public void mouseReleased (MouseEvent me) {}  
      public void mouseExited (MouseEvent me) {}  
   }
