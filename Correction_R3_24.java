import java.util.Scanner;

public class Correction_R3_24
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of quaeters: ");
		int quarters = sc.nextInt();
		double total = 0;

		if (sc.hasNextInt())
		{
			total = total + quarters * 0.25;
			System.out.println("Total: " + total);
		}
		else 
		{
			System.out.println("Input error.");
		}
	}
}