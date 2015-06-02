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
      
      boolean posRect1Clicked;
      boolean negRect1Clicked;
      boolean posRect2Clicked;
      boolean negRect2Clicked;
      boolean posRect3Clicked;
      boolean negRect3Clicked;
      boolean posRect4Clicked;
      boolean negRect4Clicked;
      boolean posRect5Clicked;
      boolean negRect5Clicked;
      boolean posRect6Clicked;
      boolean negRect6Clicked;
      
      boolean mouseEntered;
      
      public void init()
      {
         posRect1xco = 300;
         posRect1yco = 20; 
         posRect1width = 20; 
         posRect1height = 20;
         negRect1xco = 300; 
         negRect1yco = 50; 
         negRect1width = 20; 
         negRect1height = 20;
         
         posRect2xco = 300; 
         posRect2yco = 80; 
         posRect2width = 20; 
         posRect2height = 20;
         negRect2xco = 300; 
         negRect2yco = 110; 
         negRect2width = 20; 
         negRect2height = 20;
         
         posRect3xco = 300; 
         posRect3yco = 140; 
         posRect3width = 20; 
         posRect3height = 20;
         negRect3xco = 300; 
         negRect3yco = 170; 
         negRect3width = 20; 
         negRect3height = 20;
         
         posRect4xco = 300; 
         posRect4yco = 200; 
         posRect4width = 20; 
         posRect4height = 20;
         negRect4xco = 300; 
         negRect4yco = 230; 
         negRect4width = 20; 
         negRect4height = 20;
         
         posRect5xco = 300; 
         posRect5yco = 260; 
         posRect5width = 20; 
         posRect5height = 20;
         negRect5xco = 300; 
         negRect5yco = 290; 
         negRect5width = 20; 
         negRect5height = 20;
         
         posRect6xco = 300; 
         posRect6yco = 320; 
         posRect6width = 20; 
         posRect6height = 20;
         negRect6xco = 300; 
         negRect6yco = 350; 
         negRect6width = 20; 
         negRect6height = 20;
      
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
         g.setColor(Color.red);
         
         g.fillRect(posRect1xco,posRect1yco,posRect1width,posRect1height);
         g.fillRect(posRect2xco,posRect2yco,posRect2width,posRect2height);
         g.fillRect(posRect3xco,posRect3yco,posRect3width,posRect3height);
         g.fillRect(posRect4xco,posRect4yco,posRect4width,posRect4height);
         g.fillRect(posRect5xco,posRect5yco,posRect5width,posRect5height);
         g.fillRect(posRect6xco,posRect6yco,posRect6width,posRect6height);
         
         g.setColor(Color.blue);
         
         g.fillRect(negRect1xco,negRect1yco,negRect1width,negRect1height);
         g.fillRect(negRect2xco,negRect2yco,negRect2width,negRect2height);
         g.fillRect(negRect3xco,negRect3yco,negRect3width,negRect3height);
         g.fillRect(negRect4xco,negRect4yco,negRect4width,negRect4height);
         g.fillRect(negRect5xco,negRect5yco,negRect5width,negRect5height);
         g.fillRect(negRect6xco,negRect6yco,negRect6width,negRect6height);
         
         g.setColor(Color.yellow);
         
         g.drawString("+", 306, 34);
         g.drawString("-", 306, 64);
         g.drawString("+", 306, 94);
         g.drawString("-", 306, 124);
         g.drawString("+", 306, 154);
         g.drawString("-", 306, 184);
         g.drawString("+", 306, 214);
         g.drawString("-", 306, 244);
         g.drawString("+", 306, 274);
         g.drawString("-", 306, 304);
         g.drawString("+", 306, 334);
         g.drawString("-", 306, 364);
         
         g.setColor(Color.black);
         
         g.drawString("Strength: " + pop.St, 60, 50);
         g.drawString("Defense: " + pop.De, 60, 110);
         g.drawString("Speed: " + pop.Sp, 60, 170);
         g.drawString("Intelligence: " + pop.In, 60, 230);
         g.drawString("Disease Resistance: " + pop.DR, 60, 290);
         g.drawString("Hunting Efficiency: " + pop.HE, 60, 350);
      }
      
      /*
         Create a method that randomly chooses which
         event happens when you go to the next screen.
         Make some events more likely than others
         like the clearing and small traps. 
      */
      
      /*
         Need to make a boss/big end game event to
         test the player's population and see if they
         survive. 
      */
      
      public void mouseClicked (MouseEvent me) 
      {
         xpos = me.getX();
         ypos = me.getY();
         
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
            
         repaint();   
      }
       
      public void mouseEntered (MouseEvent me) {} 
      public void mousePressed (MouseEvent me) {} 
      public void mouseReleased (MouseEvent me) {}  
      public void mouseExited (MouseEvent me) {}  
   }
