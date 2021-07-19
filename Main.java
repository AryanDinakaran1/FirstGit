public class Main
{
	
	//Bubble Sort
	public static void BubbleSort(int array[])
	{
		//Length of the array
		int len = array.length;//hello

		//First Loop
		for(int i = 0; i < len - 1; i++)
		{
			//Last Loop
			for(int j = 0; j < len - i - 1;j++)
			{
				//Condition
				if(array[j] > array[j+1])
				{
					//Swapping
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
		//Count
		int count = 0;
		
		//Loop
		for(int i=0;i<array.length;i++)
		{
			//Logic Check
			if(array[i] == x)
			{
				//Print index and add to count
				System.out.println("Found "+x+" at index "+i);
				count++;
			}
		}
		//Display Number of times
		System.out.println(x+" was found "+count+" times.");
	}

	//Main Method
	public static void main(String args[])
	{
		//Array
		int[] array = {4,9,0,3,5,6,1,4};

		//Algorithms
		BubbleSort(array);	//Applied Bubblesort
		LinearSearch(array,4);	//Applied LinearSearch

	}
}
