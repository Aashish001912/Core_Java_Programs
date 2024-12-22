package interface_AdvancedArithmetic;

public class MyCalculator implements AdvancedArithmetic 
{

	@Override
	public int divisorsum(int n) 
	{
		if(n<=0)
		{
			System.out.println("Input must be a positive ");
		}
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
