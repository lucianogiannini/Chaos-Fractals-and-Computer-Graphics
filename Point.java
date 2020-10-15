public class Point
{
   int x, y;
   static double  dis1 = .33333333333333333;
   static double dis2 = .66666666666666666;
   public Point()
   {
      x = 0;
      y = 0;
   }
   
   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   public static Point getMidpoint(Point a, Point b)
          {
                Point p = new Point(((a.x()+b.x())/2),((a.y()+b.y())/2));
                return p;

           }
           
   public static Point getTripoint(Point a, Point b)
          {
          int ax = a.x();
          int ay = a.y();
          int bx = b.x();
          int by = b.y();
          double  px = ((bx-ax)/3);
          double py = ((by-ay)/3);
          int px1 = (int)px;
          int py1 = (int)py;
          int px2 = bx - px1;
          int py2 = by - py1;

          Point x = new Point(px2, py2);
                return x;
           }
           public static Point getFivepoint(Point a, Point b)
          {
          int ax = a.x();
          int ay = a.y();
          int bx = b.x();
          int by = b.y();
          double  px = ((bx-ax)/5);
          double py = ((by-ay)/5);
          int px1 = (int)px;
          int py1 = (int)py;
          int px2 = bx - px1;
          int py2 = by - py1;

          Point x = new Point(px2, py2);
                return x;
           }
           
           
   public int x()
   {
     return x;
   }
   public int y()
   {
     return y;
   }
   
}