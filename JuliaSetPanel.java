import javax.swing.*;
import java.awt.*;
import java.util.*;

public class JuliaSetPanel extends JPanel
{
//points -2-2i and 2+2i
int lower_x = -2;
int lower_y = -2;
int upper_x = 2;
int upper_y = 2;


public void paintComponent(Graphics g)
   {
      super.paintComponent(g); 
      drawOriginal(g);
   }
   
   public void drawOriginal(Graphics g)
   {