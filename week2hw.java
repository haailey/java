import java.util.Scanner;

public class week2hw
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10]; 
		for (int input = 0; input < num.length; input++)
		{
			System.out.print("Please input number" + (input + 1) + "grade");
			num[input] = sc.nextInt();
			{
				int sum = 0;
				num[input-1] = num[input];
				sum = sum + num[input];
				{
					System.out.println("sum="+sum);
				}
			}
		}
	}
}