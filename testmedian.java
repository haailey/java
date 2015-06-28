import java.util.Scanner;

public class testmedian
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10]; 
		int c = 0;

		for (int input = 0; input < array.length; input++)
		{
			System.out.print("Please input number" + (input + 1) + "grade");
			array[input] = sc.nextInt();
			int length = array.length;
			int[] sort = new int[length];	
			System.arraycopy(array, 0, sort, 0, sort.length);

			        //Arrays.sort(sort);

			if (length % 2 == 0)
			{
				c = (sort[(sort.length/2) - 1] + sort[sort.length / 2]) / 2;
				{
					System.out.println(c);
				}
			}
		}
	}
    
}