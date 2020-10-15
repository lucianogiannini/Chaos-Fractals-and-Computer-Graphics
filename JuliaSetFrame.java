import javax.swing.*;
import java.util.*;
import java.awt.*;

public class JuliaSetFrame extends JFrame
{
  public JuliaSetFrame(String title)
  {
    super(title);
    setBounds(0,0,800,800);
    
    JPanel julia = new JuliaSet();
    add(julia);
    setVisible(true);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String[]args)
  {
    JFrame frame = new JuliaSetFrame("Julia Set");
  }
}