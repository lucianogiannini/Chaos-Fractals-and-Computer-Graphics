import javax.swing.*;
import java.util.*;
import java.awt.*;

public class SierpinskiFrame extends JFrame
{  
   public SierpinskiFrame(String title, int dep)
   {
      super(title);
      setBounds(0,0,450,450);
      JPanel Sierpinski = new SierpinskiPanel(dep);
      add(Sierpinski);
      setVisible(true);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      //JFrame frame = new SierpinskiFrame("Sierpinski");
      System.out.println("Enter the desired depth:");
      int num = input.nextInt();
      JFrame frame = new SierpinskiFrame("Sierpinski", num);
   }
}