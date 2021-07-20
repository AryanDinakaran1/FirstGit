public class Recursion
{
	public static void Hello(int n)
	{
		if(n == 0)
		{
			System.out.println("Done!");
		}
		else
		{
			System.out.println("Hello");
			n--;
			Hello(n);
		}
	}

	public static void main(String args[])
	{
		Hello(10);
	}
}
