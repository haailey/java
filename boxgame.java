import java.util.Scanner;

public class boxgame
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a room: ");
		int room = input.nextInt();

		if (room == 1)
		{
			System.out.println("You have entered a bear room.");
			{
				Scanner input2 = new Scanner(System.in);
				System.out.println("Please choose a box: ");
				int box = input2.nextInt();

				if (box == 1)
				{
					System.out.println("You got a large bear.");
				}
				else
				{
					if (box == 2)
				{
					System.out.println("You got a small bear");
				}
				}
			}
		}

	}
}