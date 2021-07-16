public class Main
{
	//Bubble Sort
	public static void BubbleSort(int array[])
	{

	}
	
	//Linear Search
	public static void LinearSearch(int array[], int x)
	{
		int count = 0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i] == x)
			{
				System.out.println("Found "+x+" at index "+i);
				count++;
			}
		}
		System.out.println(x+" was found "+count+" times.");
	}

	//Main Method
	public static void main(String args[])
	{
		int[] array = {4,9,0,3,5,6,1,4};
		
		LinearSearch(array,4);

	}
}
