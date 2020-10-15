import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Valentine_ShapeFrame extends JFrame
{  
   public Valentine_ShapeFrame(String title)
   {
      super(title);
      setBounds(0,0,450,450);
      JPanel Valentine_Shape = new Valentine_Shape();
      add(Valentine_Shape);
      setVisible(true);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      JFrame frame = new Valentine_ShapeFrame("Valentine's Shape");
         }
}