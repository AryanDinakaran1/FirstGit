public class Main
{
	//Bubble Sort
	public static void BubbleSort(int array[])
	{
		int len = array.length;

		for(int i = 0; i < len - 1; i++)
		{
			for(int j = 0; j < len - i - 1;j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
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

		BubbleSort(array);		
		LinearSearch(array,4);

	}
}
