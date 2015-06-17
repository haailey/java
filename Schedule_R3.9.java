public class Schedule_R3_9
{
	public static void main(String[] args)
	{
		int start1 = 10;
		int start2 = 11;
		int end1 = 12;
		int end2 = 13;
		int s;
		int e;

		if (start1 > start2)
			{
				s = start1;
			}
		else if (start2 < start2)
			{
				s = start2;
			}
		if (end1 < end2)
			{
				e = end1;
			}
		else if (end1 < end2)
			{
				e = end2;
			}
		if (s < e)
			{
				System.out.println("The appointments overlap.");
			}
		else if (s > e)
			{
				System.out.println("The appointments don't overlap.");
			}
	}
}