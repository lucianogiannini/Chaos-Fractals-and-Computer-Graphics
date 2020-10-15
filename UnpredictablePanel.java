import javax.swing.*;
import java.awt.*;
import java.util.*;

public class UnpredictablePanel extends JPanel
{
   Point a,b,c,p,v,xy;
   int num1, num2;
   
   public UnpredictablePanel()
   {
      a = new Point(210,10);
      b = new Point(10,410);
      c = new Point(410,410);
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
      setBackground(Color.black);

      //big triangle
      g.drawRect(a.x,a.y,1,1);
      g.drawRect(b.x,b.y,1,1);
      g.drawRect(c.x,c.y,1,1);
      
      g.drawLine(a.x,a.y,b.x,b.y);
      g.drawLine(b.x,b.y,c.x,c.y);
      g.drawLine(c.x,c.y,a.x,a.y);
      
      Random r = new Random();
      num2 = r.nextInt(3)+1;
      //System.out.println("num2 = " + num2);
      
      switch(num2)
      {
         case 1:
               xy = new Point(210,10);
               break;
         case 2:
               xy = new Point(10,410);
               break;
         case 3:
               xy = new Point(410,410);
               break;
      }
      
      for(int i = 0; i < 10000; i++)
      {
         num1 = r.nextInt(3)+1;
         //System.out.println("num1 = " + num1);
         
         switch(num1)
         {
            case 1:
                  v = new Point(210,10);
                  break;
            case 2:
                  v = new Point(10,410);
                  break;
            case 3: 
                  v = new Point(410,410);
                  break;
         }
      
         Point p = getMidpoint(xy,v);
         xy = p;
         //System.out.println(p);  
         g.drawRect(p.x,p.y,2,2);
      }
   } 
}
