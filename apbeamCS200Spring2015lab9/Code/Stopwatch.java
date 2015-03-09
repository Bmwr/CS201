public class Stopwatch
{
  private double start;
  private double total;
  public Stopwatch()
  {
    start = System.currentTimeMillis();
  }
  public double elapsedTime()
  {
    long now = System.currentTimeMillis();
    return (now - start)/ 1000.0;
  }
  public void restart()
  {
    start = System.currentTimeMillis() - total*1000.0;
  }
  public double stop()
  {
    total = elapsedTime();
    return total;
  }
  public static void main(String[] args)
  {
    StdOut.println("Type 1 to begin the Stopwatch.");
    StdOut.println("Type 0 to stop the Stopwatch.");
    StdOut.println("Type -1 to restart the Stopwatch.");
    Stopwatch a = null;

    while(true)
    {
      int num = StdIn.readInt();
      if  (num > 0)
      {
        StdOut.println("Starting Stopwatch.");
        a = new Stopwatch();
        StdOut.println(a);
      }
      else if (num < 0)
      {
        StdOut.println("Restarting Stopwatch.");
        a.restart();
        StdOut.println(a);
      }
      else
      {
        StdOut.println("Stopping Stopwatch.");
        StdOut.println(a.stop());
      }
    }
  }
}
