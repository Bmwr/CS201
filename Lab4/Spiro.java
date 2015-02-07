public class Spiro
{
  public static void main(String[] args)
  {
    double R = Double.parseDouble(args[0]);
    double r = Double.parseDouble(args[1]);
    double a = Double.parseDouble(args[2]);
    double offset = (R+2*r+a);
    int N= 100000; 
    double[] Y=new double[N];
    double[] X=new double[N];
       
    StdDraw.setXscale(-500, 500);
    StdDraw.setYscale(-500, 500);     
    StdDraw.setPenRadius(.005);
    StdDraw.clear(StdDraw.GRAY);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.circle(0.0, 0.0, R);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.circle(0.0, 0.0, offset);
    
    for (int i=0; i < N; i++)
    {
      double t = i * .1;
      X[i] = (R+r)*Math.cos(t)-(r+a)*Math.cos((R+r)*t/r);       
      Y[i] = (R+r)*Math.sin(t)-(r+a)*Math.sin((R+r)*t/r);  
      //StdDraw.point(X[t], Y[t]); 
    }
        
    for (int t = 0; t < N-1; t++) 
    {
      StdDraw.setPenColor(StdDraw.MAGENTA);
      StdDraw.line(X[t], Y[t], X[t+1], Y[t+1]);
    }    
                        
    double B = (R * .5);
    double C = (r * .5);
    double D = (a * .5);
    double offset1 = (B+2*C+D);
    
    
    for (int i=0; i < N; i++)
    {
      double t = i * .1;
      X[i] = (B+C)*Math.cos(t)-(C+D)*Math.cos((B+C)*t/C);       
      Y[i] = (B+C)*Math.sin(t)-(C+D)*Math.sin((B+C)*t/C);  
      //StdDraw.point(X[t], Y[t]); 
    }
    
      for (int t = 0; t < N-1; t++)
      {
      StdDraw.circle(0.0, 0.0, offset1);
      StdDraw.setPenColor(StdDraw.YELLOW);
      StdDraw.circle(0.0, 0.0, B);  
      StdDraw.line(X[t], Y[t], X[t+1], Y[t+1]);
      StdDraw.setPenColor(StdDraw.BLACK);
    }
    double E = (R * .25);
    double F = (r * .25);
    double G = (a * .25);
    double offset2 = (E+2*F+G);
        
    for (int i=0; i < N; i++)
    {
      double t = i * .1;
      X[i] = (E+F)*Math.cos(t)-(F+G)*Math.cos((E+F)*t/F);       
      Y[i] = (E+F)*Math.sin(t)-(F+G)*Math.sin((E+F)*t/F);  
      //StdDraw.point(X[t], Y[t]); 
    }
    
      for (int t = 0; t < N-1; t++)
      {
      StdDraw.circle(0.0, 0.0, offset2); 
      StdDraw.setPenColor(StdDraw.PINK);
      StdDraw.circle(0.0, 0.0, E);  
      StdDraw.line(X[t], Y[t], X[t+1], Y[t+1]);
      StdDraw.setPenColor(StdDraw.BLACK);
    }
  }
}


  



