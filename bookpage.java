import java.util.Scanner;

public class bookpage
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please input things: ");
		int thing = in.nextInt(); 

		if(thing == 1)
		{
			System.out.println("Please turn to page: 125");
		}
		else if (thing == 2)
		{
			System.out.println("Please turn to page: 267");
		}
		else if (thing == 3)
		{
			System.out.println("Please turn to page: 359");
		}
	}
}