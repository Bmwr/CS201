import java.awt.Color;

public class Spirograph
{
	private int N         = 5000;
	private double r      = 0.0 ;
	private double R      = 0.0 ;
	private double a      = 0.0 ;
	private double[] Y    = new double[N]    ;
	private double[] X    = new double[N]    ;
	private double offset = ( R + 2 * r + a );
	private Color color   = StdDraw.MAGENTA  ;

	public Spirograph( double R, double r, double a )
	{ // Create new sspirograph settings..
		this.R = R;
		this.r = r;
		this.a = a;
	}

	public Spirograph multiplier(double multiplier)
	{
		this.R *= multiplier;
		this.r *= multiplier;
		this.a *= multiplier;
		return this;
	}

	public Spirograph setColor(Color color)
	{
		this.color = color;
		return this;
	}

	public void draw()
	{ // Sets the window and draws the spirograph.
		StdDraw.setXscale( -500, 500 			 );
		StdDraw.setYscale( -500, 500 			 );
		StdDraw.setPenRadius( .005				 );
		StdDraw.setPenColor( StdDraw.BLACK );
		StdDraw.circle( 0.0, 0.0, R 			 );
		StdDraw.circle( 0.0, 0.0, offset   );

		for ( int i = 0; i < N; i++ )
		{ // Fills the arrays with points on the spirograph.
			double t = i * .1;
			X[i]     = ( R+r )*Math.cos( t )-( r+a )*Math.cos(( R+r )*t/r );
			Y[i]     = ( R+r )*Math.sin( t )-( r+a )*Math.sin(( R+r )*t/r );
		}
		//StdDraw.point(X[t], Y[t]);
		for ( int t = 0; t < N-1; t++ )
		{
			StdDraw.setPenColor( this.color          );
			StdDraw.line( X[t], Y[t], X[t+1], Y[t+1] );
		}
	}

	public static void main(String[] args)
	{
		Spirograph test  = new Spirograph(
			Double.parseDouble(args[0]),
			Double.parseDouble(args[1]),
			Double.parseDouble(args[2])
		);
		double times = Double.parseDouble(args[3]);
		StdDraw.clear( StdDraw.GRAY              );
		test.setColor( StdDraw.MAGENTA    ).draw();
		test.multiplier( times ).setColor( StdDraw.GREEN ).draw();
	  test.multiplier( times ).setColor( StdDraw.CYAN  ).draw();
 	}
}
