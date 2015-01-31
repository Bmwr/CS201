import java.awt.Color;

public class Tricolor
{
  //show only red color(c) pigment.
  private static Picture red(Picture pic)
  {
    for(int i=0; i < pic.width(); i++)
    {
      for (int j=0; j < pic.height(); j++)
      {
        Color col = pic.get(i,j);
        pic.set(i,j, new Color(col.getRed(),0,0));
      }
    }
    return pic;
  }
  //show only green c pigment.
  private static Picture green(Picture pic)
  {
    for(int i=0; i<pic.width(); i++)
    {
      for (int j=0; j<pic.height(); j++)
      {
        Color col = pic.get(i,j);
        pic.set(i,j, new Color(0,col.getGreen(),0));
      }
    }
    return pic;
  }
  //show only blue c pigment
  private static Picture blue(Picture pic)
  {
    for(int i=0; i<pic.width(); i++)
    {
      for (int j=0; j<pic.height(); j++)
      {
        Color col = pic.get(i,j);
        pic.set(i,j, new Color(0,0,col.getBlue()));
      }
    }
    return pic;
  }

  public static void main(String[] args)
  {
    new Picture(args[0]).show();

    // Prints picture with only Red pigmant.
    red(new Picture(args[0])).show();

    // Prints picture with only Green pigmant.
    green(new Picture(args[0])).show();

    // Prints picture with only Blue pigmant.
    blue(new Picture(args[0])).show();

  }
}
