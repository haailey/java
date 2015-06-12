public class testArray
{
public static double calculateMedian(int[] arr)
  {

	// Sort our array
	int[] sortedArr = bubbleSort(arr);
		
	double median = 0;
		
	// If our array's length is even, then we need to find the average of the two centered values
	if (arr.length % 2 == 0)
	{
		int indexA = (arr.length - 1) / 2;
		int indexB = arr.length / 2;
			
		median = ((double) (sortedArr[indexA] + sortedArr[indexB])) / 2;
		}
		// Else if our array's length is odd, then we simply find the value at the center index
		else  
		{
			int index = (sortedArr.length - 1) / 2;
			median = sortedArr[ index ];

			for (int v : sortedArr) 
			System.out.println(v);
		}
	}	

}	
