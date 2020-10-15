import javax.swing.*;
import java.util.*;
import java.awt.*;
public class UnpredictableImaginationFrame extends JFrame
{
   public UnpredictableImaginationFrame(String title)
   {
      super(title);
      setBounds(0,0,500,500);

      JPanel UnpredictableImagination = new UnpredictableImaginationPanel();
      add(UnpredictableImagination);
      setVisible(true);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[]args)
   {
      JFrame frame = new UnpredictableImaginationFrame("Unpredictable Imagination");
   }
}