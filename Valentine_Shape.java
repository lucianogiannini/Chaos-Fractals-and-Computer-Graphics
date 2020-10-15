import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Valentine_Shape extends JPanel
{
   Point a,b,c,d,e,f, xy, v;
   int depth1;
   Random rand = new Random(); 
   public Valentine_Shape()
   {
      a = new Point(200,0);
      b = new Point(0,400);
      c = new Point(400,400); 
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      drawPixel(a.x,a.y,b.x,b.y,c.x,c.y,g);
        }
   
   public void drawPixel(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g)
   {
      g.setColor(Color.red);
      setBackground(Color.black);
      int  a = rand.nextInt(3);
      switch(a)
      {
      case 0: 
      { xy = new Point(x1,y1);  break;}
      case 1: 
      { xy = new Point(x2,y2);  break;}
      case 2:
      { xy = new Point(x3,y3);  break;}
      }
      
      for(int i = 0; i <= 1000000; i++)    
      {
      int  randomnum = rand.nextInt(3);
      switch(randomnum)
      {
      case 0: 
      {v = new Point(x1,y1); break;}
      case 1: 
      {v = new Point(x2,y2); break;}
      case 2: 
      {v = new Point(x3,y3); break;}
      }
       Point p = Point.getMidpoint(xy,v);

      g.drawLine(p.x(),p.y(),p.x(),p.y());
      xy = p;      
     }
      
      }
   }
