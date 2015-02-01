public class Rectangle
{
  private final double x;
  private final double y;

  private final double width;
  private final double height;

  public Rectangle(double x0, double y0, double w, double h)
  {
    x = x0;
    y = y0;
    width = w;
    height = h;
  }
  public double area()
  {
    //Computes the area of the rectangle.
    return width * height;
  }
  public double perimeter()
  {
    //Computes the perimeter of the rectangle.
    return 2*width + 2*height;
  }
  public boolean intersects(Rectangle b)
  {
    //does this rectangle intersect b?
    if (b.width > 0 && b.height > 0 && width > 0 && height > 0
        && b.x < x + width && b.x + b.width > x
        && b.y < y + height && b.y + b.height >y)
    return true;
    else
    return false;

  }
  public void show(Rectangle b)
  {
    // Draw the rectangle on StdDraw.
    StdDraw.rectangle(x, y, width/2, height/2);
  }
}
