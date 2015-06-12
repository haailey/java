import java.util.Scanner;
import java.util.Arrays;

public class week2hw
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10]; 
		int sum = 0;
		int average = 0;

		for (int input = 0; input < num.length; input++)
		{
			System.out.print("Please input number" + (input + 1) + "grade");
			num[input] = sc.nextInt();
			sum=sum+num[input];
			Arrays.sort(num);
			double median;
			if (num.length % 2 ==0)
				median = ((double)num[num.length/2]+(double)num[num.length/2-1])/2;
			else
				median = (double)num[num.length/2];
			
			{
				average=sum/10;
				System.out.println("Average="+average);
				System.out.println("sum="+sum);
				System.out.println("Median="+median);
			}
		}
	}
}