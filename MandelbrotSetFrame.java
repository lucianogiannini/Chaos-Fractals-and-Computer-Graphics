import javax.swing.*;
import java.util.*;
import java.awt.*;

public class MandelbrotSetFrame extends JFrame
{
  public MandelbrotSetFrame(String title)
  {
    super(title);
    setBounds(0,0,800,800);
    
    JPanel m = new MandelbrotSet();
    add(m);
    setVisible(true);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String[]args)
  {
    JFrame frame = new MandelbrotSetFrame("Mandelbrot Set");
  }
}