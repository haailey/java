import java.util.Scanner;
import java.lang.Math;
public class GuessNumber
{
	public static void main(String[] args)
	{
		while(true)
		{			
			Scanner s = new Scanner(System.in);
			System.out.println("Welcome to Guess Number Game:");
			System.out.println("Press 1 Begin 2 Exit");
			int ch = 0;
        	ch = s.nextInt();
        	if(ch==1)
        	{
        		System.out.println("--------------");
        		Scanner ca = new Scanner(System.in);
        		int max = 0;
        		int input = 0;
        		int i = 0;
        		max = (int)(Math.random()*100);
        		do
        		{
        			System.out.println("Please enter a number:");
        			input = ca.nextInt();
        			if(input < max)
        			System.out.println("It's too low!");
        			if(input > max)
        			System.out.println("It's too high!");
        			if(input==max)
        			{
        				break;
        				i++;
        				While(i > 10);
        				switch(i)
        				{
        					default: System.out.println("Sorry,you've used all your chances");
								{
									if(ch==2); {break;}
										{
											System.out.println("Thank you!");}		
        					    }
						}
        			}
        		}
        	}
		}	
	}