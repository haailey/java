public class oddsum
{
	public static void main(String[] args)
	{
		int i = 1; 
		int sum = 0;
		int product; 

		for (i = 1; i <= 100; i++)
		{
			product = i / 9;
			if (product == 10 || product ==11)
			{
				System.out.println(i);
			}
		}
	}
}