
public static void main(String[] args)
{
  double x0 = Double.parseDouble(args[0]);
  double y0 = Double.parseDouble(args[1]);
  double width = Double.parseDouble(args[2]);
  double height = Double.parseDouble(args[3]);
  Rectangle a = new Rectangle(x0, y0, width, height);

  StdOut.println("The area of Rectangle a is " + a.area);
  StdOut.println("The perimeter of Rectangle a is " + a.perimeter);


  double x0 = Double.parseDouble(args[4]);
  double y0 = Double.parseDouble(args[5]);
  double width = Double.parseDouble(args[6]);
  double height = Double.parseDouble(args[7]);
  Rectangle b = new Rectangle(x0, y0, width, height);

  StdOut.println("The area of Rectangle b is " + b.area);
  StdOut.println("The perimeter of Rectangle b is " + b.perimeter);

  StdOut.println("Do the two rectangle intersect? " + a.intersect);
  show(Rectangle a);
  show(Rectangle b);

}
