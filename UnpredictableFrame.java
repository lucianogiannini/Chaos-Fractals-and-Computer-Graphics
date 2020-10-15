import javax.swing.*;
import java.util.*;
import java.awt.*;
public class UnpredictableFrame extends JFrame
{
   public UnpredictableFrame(String title)
   {
      super(title);
      setBounds(0,0,450,450);

      JPanel Unpredictable = new UnpredictablePanel();
      add(Unpredictable);
      setVisible(true);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[]args)
   {
      JFrame frame = new UnpredictableFrame("Unpredictable");
   }
}