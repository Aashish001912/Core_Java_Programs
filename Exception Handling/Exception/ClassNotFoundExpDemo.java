package Exception;

public  class ClassNotFoundExpDemo 
{
	Class<?>c;
  public ClassNotFoundExpDemo()
  {
	  try 
	  {
          c = Class.forName("java.util.Scanner");
          System.out.println("Class Found");
      } 
	  catch (ClassNotFoundException e)
	  {
          System.out.println("ClassNotFoundException caught!");
          e.printStackTrace();
      }
  }
  public static void main(String []args)
  {
	  ClassNotFoundExpDemo demo=new ClassNotFoundExpDemo();
  }
}