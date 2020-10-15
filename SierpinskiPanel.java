import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SierpinskiPanel extends JPanel
{
   Point a,b,c,d,e,f;
   int depth1;
   
   public SierpinskiPanel(int depth)
   {
      a = new Point(210,10);
      b = new Point(10,410);
      c = new Point(410,410);
      depth1 = depth;
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      sierpienski(a.x,a.y,b.x,b.y,c.x,c.y,depth1,g);
   }
   
   public void sierpienski(int x1, int y1, int x2, int y2, int x3, int y3, int depth, Graphics g)
   {
      g.setColor(Color.red);
      setBackground(Color.white);
      
      if(depth != 0)
      {
         depth--;
      
     // g.drawRect(x1,y1,1,1);
      //g.drawRect(x2,y2,1,1);
      //g.drawRect(x3,y3,1,1);
      
      g.drawLine(x1,y1,x2,y2);
      g.drawLine(x2,y2,x3,y3);
      g.drawLine(x3,y3,x1,y1);
      
      sierpienski(x1,y1,(x1+x2)/2,(y1+y2)/2,(x3+x1)/2,(y3+y1)/2,depth,g);
      sierpienski((x1+x2)/2,(y1+y2)/2,x2,y2,(x2+x3)/2,(y2+y3)/2,depth,g);
      sierpienski((x3+x1)/2,(y3+y1)/2,(x2+x3)/2,(y2+y3)/2,x3,y3,depth,g);
      }
   }
}