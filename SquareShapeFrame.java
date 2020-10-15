import javax.swing.*;
import java.util.*;
import java.awt.*;

public class SquareShapeFrame extends JFrame
{  
   public SquareShapeFrame(String title)
   {
      super(title);
      setBounds(0,0,500,500);
      JPanel SquareShape = new SquareShape();
      add(SquareShape);
      setVisible(true);
      setResizable(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      JFrame frame = new SquareShapeFrame("Square Shape");
         }
}