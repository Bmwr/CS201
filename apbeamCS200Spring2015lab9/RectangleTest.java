public class RectangleTest
{
  public static void main(String[] args)
  {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double w = Double.parseDouble(args[2]);
    double h = Double.parseDouble(args[3]);
    Rectangle a = new Rectangle(x, y, w, h);
    StdOut.println("The area of Rectangle a is " + a.area());
    StdOut.println("The perimeter of Rectangle a is " + a.perimeter());

    x = Double.parseDouble(args[4]);
    y = Double.parseDouble(args[5]);
    w = Double.parseDouble(args[6]);
    h = Double.parseDouble(args[7]);
    Rectangle b = new Rectangle(x, y, w, h);
    StdOut.println("The area of Rectangle b is " + b.area());
    StdOut.println("The perimeter of Rectangle b is " + b.perimeter());
    StdDraw.setPenColor(StdDraw.RED);
    a.show();
    StdDraw.setPenColor(StdDraw.BLUE);
    b.show();

    StdOut.println("Do the 2 rectangles intersect? " + a.intersects(b));
  }
}
