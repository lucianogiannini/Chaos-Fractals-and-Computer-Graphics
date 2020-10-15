import javax.swing.*;
import java.awt.*;
import java.util.*;

public class JuliaSet extends JPanel
{
  
  private int lower_x, lower_y, upper_x, upper_y, max;
  
  public JuliaSet()
  {
    lower_x = -2;
    lower_y = -2;
    upper_x = 2;
    upper_y = 2;
    max = 55;
  }
  
  public Complex f( Complex z)
  {
    Complex a = new Complex(.2,.6);
    return (z.mul(z)).add(a);
  }
  
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    Complex c;
    int xPixel = 0;
    int yPixel = 0;
    for (double x = lower_x; x < upper_x; x += .005)
     {
      xPixel++;
      yPixel=0;
      for (double y = lower_y; y < upper_y; y += .005)    
      {
        yPixel++;
         int i;
         c = new Complex(x,y);
         
         for (i = 0;i<max;i++)
         {
           c = f(c);
           if (c.abs()>2)
            break;
           //g.drawRect(xPixel,yPixel,1,1);
          }
         //System.out.println("Working");
         int clr = max - i;
         float  red = (clr * 23  %   256)/256.0f;  // the f makes 256.0 a float, rather than a double

         float green = (clr * 6   %   256)/256.0f;

         float blue = (clr * 13   %   256)/256.0f;

         Color color = new Color(red, green, blue); // parameters are float
         
//         if (clr == max)
//           g.setColor(Color.BLACK);
//         else
          g.setColor(color);
//         System.out.println(xPixel);
//         System.out.println(yPixel);
         g.drawRect(xPixel,yPixel,1,1);
      }
    }
  }
}
         
         