public class sum_1_100
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 1; i<= 10000000;i++)
		{
			sum = sum + i;
			//System.out.println(sum);
			
		}
		System.out.println(sum);
	}
}