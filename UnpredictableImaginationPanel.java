import javax.swing.*;
import java.awt.*;
import java.util.*;

public class UnpredictableImaginationPanel extends JPanel
{
   Point a,b,c, d, e, p, xy, v;
   int num1, num2;
   
   public UnpredictableImaginationPanel()
   {
      a = new Point(210,10);
      b = new Point(20,160);
      c = new Point(90,380);
      d = new Point(340,380);
      e = new Point(400,160);
      
   }
   
   public Point getMidpoint(Point a, Point b)
   {
      Point p = new Point((a.x+b.x)/2,(a.y+b.y)/2);
      return p;
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g); 
      drawOriginal(g);
   }
   
   public void drawOriginal(Graphics g)
   {
      g.setColor(Color.red);
      setBackground(Color.white);

      g.drawRect(a.x,a.y,1,1);
      g.drawRect(b.x,b.y,1,1);
      g.drawRect(c.x,c.y,1,1);
      g.drawRect(d.x,d.y,1,1);
      g.drawRect(e.x,e.y,1,1);      
      Random r = new Random();
      num2 = r.nextInt(5)+1;
      
      switch(num2)
      {
         case 1:
               xy = a;
               break;
         case 2:
               xy = b;
               break;
         case 3:
               xy = c;
               break;
         case 4:
               xy = d;
               break;
         case 5:
               xy = e;
               break;
      }
      
      for(int i = 0; i < 1000000; i++)
      {
         num1 = r.nextInt(5)+1;
         switch(num1)
         {
            case 1:
                  v = a;
                  break;
            case 2:
                  v = b;
                  break;
            case 3:
                  v = c;
                  break;
            case 4:
                  v = d;
                  break;
            case 5:
                  v = e;
                  break;
         }      
         Point p = Point.getTripoint(xy,v);
         xy = p;  
         g.drawRect(p.x,p.y,1,1);
      }

   }
}