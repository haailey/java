import java.util.Scanner;

public class sortthreedigitnum
{
	public static void main(String[] args)
	{
		//Scanner input = new Scanner(System.in);
		//System.out.println("Please enter a 3 digit number: ");
		//int num = input.nextInt();
		int i = 1000;
		double product = i;
		for (i=1000;i<=9999;i++)
		{
		int a , b , c, d ,e ,f;
		a = i / 1000;
		d = i % 1000;
		b = d / 100;
		c = d % 100;
		e = c /10;
		f = c % 10;

		if (a == 9 && f % 2 == 0)
		{
		product = product*i;
		System.out.println(product);
		}
		}
		

	}
}