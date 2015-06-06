public class R1_17
{
	public static void main(String[] args)
	{
		double pi_cal = 0;
		for(double i = 1.0; i<200.0;i++)
		{
			pi_cal = pi_cal + 4*(1/(2*i-1))*(Math.pow(-1 , (i+1)));	
			//System.out.println(i);
				 
		}
		float pi = (float)(Math.round(pi_cal*100000))/100000;
		System.out.println(pi);	
	}
}