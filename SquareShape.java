import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SquareShape extends JPanel
{
   Point a,b,c,d,mp1,mp2,mp3,mp4, xy, v;
   int depth1;
   Random rand = new Random(); 
   public SquareShape()
   {
      a = new Point(0,0);//top left
      b = new Point(400,0);//top right
      c = new Point(400,400);//bot right
      d = new Point(0,400);//both left
     
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      drawPixel(a.x,a.y,b.x,b.y,c.x,c.y,d.x,d.y,g);
        }
   
   public void drawPixel(int x1, int y1, int x2, int y2, int x3, int y3,int x4, int y4, Graphics g)
   {
      g.setColor(Color.red);
      setBackground(Color.black);
       

      int  ax = rand.nextInt(8);
     
      mp1 = Point.getMidpoint(a,b);
      mp2 = Point.getMidpoint(b,c);
      mp3 = Point.getMidpoint(c,d);
      mp4 = Point.getMidpoint(d,a);
      
      switch(ax)
      {
      case 0: 
      { xy = new Point(x1,y1);  break;}
      case 1: 
      { xy = new Point(x2,y2);  break;}
      case 2:
      { xy = new Point(x3,y3);  break;}
      case 3:
      { xy = new Point(x4,y4);  break;}
      case 4: 
      { xy = new Point(mp1.x(),mp1.y());  break;}
      case 5: 
      { xy = new Point(mp2.x(),mp2.y());  break;}
      case 6: 
      { xy = new Point(mp3.x(),mp3.y());  break;}
      case 7: 
      { xy = new Point(mp4.x(),mp4.y());  break;}

           }
      
      for(long i = 0; i <= 10000000; i++)
      {
      int  randomnum = rand.nextInt(8);
      switch(randomnum)
      {
      case 0: 
      {v = new Point(x1,y1); break;}
      case 1: 
      {v = new Point(x2,y2); break;}
      case 2: 
      {v = new Point(x3,y3); break;}
      case 3: 
      {v = new Point(x4,y4); break;}
      case 4: 
      { v = new Point(mp1.x,mp1.y);  break;}
      case 5: 
      { v = new Point(mp2.x,mp2.y);  break;}
      case 6: 
      { v = new Point(mp3.x,mp3.y);  break;}
      case 7: 
      { v = new Point(mp4.x,mp4.y);  break;}
      }
       Point p = Point.getTripoint(xy,v);

      g.drawLine(p.x(),p.y(),p.x(),p.y());
      xy = p;
   
      
     }
      }
   }
