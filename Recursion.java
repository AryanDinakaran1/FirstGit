public class Recursion
{
	public static void hello(int n)
	{
		if(n == 0)
		{
			System.out.println("Done!");
		}
		else
		{
			System.out.println("Hello!");
			n--;
			hello(n);
		}
	}
	public static void main(String args[])
	{
		hello(10);
	}
}
