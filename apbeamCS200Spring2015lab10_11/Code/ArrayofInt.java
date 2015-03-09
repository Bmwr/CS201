public class ArrayofInt
{
	private int[] a;

	public ArrayofInt(int[] a)
	{
		this.a = a;
	}

	public ArrayofInt(int size)
	{
	 	this.a = new int[size];
	}

	public int length()
	{
		return a.length;
	}

	public int get(int index)
	{
		return a[index];
	}

	public void put(int index, int value)
	{
		this.a[index] = value;
	}

	public int[] toArray()
	{
		return this.a;
	}

	public String toString()
	{
		String s = "The array is: ";
		for (int i = 0; i < length(); i++)
		{
			s += get(i) + " ";
		}
		return s;
	}

	public void draw()
	{
		StdDraw.clear(StdDraw.BLUE);
		StdDraw.setXscale(0, 20);
		StdDraw.setYscale(0, 20);
		StdDraw.setPenRadius(.5);
		StdDraw.setPenColor(StdDraw.GREEN);
		double[] bravo = new double[length()];
			for (int i = 0; i < length(); i++)
			{
				bravo[i] = (double)a[i];
			}

		StdStats.plotBars(bravo);
	}

	public void swap(int indexA, int indexB)
	{
		int b = this.get(indexA);
		this.put(indexA, this.get(indexB));
		this.put(indexB, b);
	}

	public int compare(int indexA, int indexB)
	{
		if (this.get(indexA) < this.get(indexB)) return 1;
		else if (this.get(indexA) > this.get(indexB)) return -1;
		else return 0;
	}

	public void compareAndSwap(int indexA, int indexB)
	{
		if (this.compare(indexA, indexB) < 0)
		{
			this.swap(indexA, indexB);
		}
	}

	public static void main(String[] args)
	{
		ArrayofInt test = new ArrayofInt(10);
			for (int i = 0; i < test.length(); i++)
			{
				test.put(i, ((int)(Math.random()*10)));
			}
		System.out.println(test);

		System.out.println(test.length());
		System.out.println(test);

		test.put(3, 10);
		System.out.println(test.get(3));
		System.out.println(test);

		test.swap(2, 3);
		System.out.println(test);
		System.out.println(test.compare(2, 3));

		test.compareAndSwap(2, 3);
		System.out.println(test);
		test.draw();

	}
}
