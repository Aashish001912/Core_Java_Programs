package interface_CaluculatorProgram;

public class SimpleCalculator implements Calculator
{

	@Override
	public void calculateSum(int... x)
	{
      int sum=0;
      for(int z:x)
      {
    	  sum+=z;
      }
      System.out.println(sum);
      

	}

}
