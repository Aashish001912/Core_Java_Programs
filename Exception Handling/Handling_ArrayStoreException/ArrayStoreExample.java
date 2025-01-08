package Handling_ArrayStoreException;

public class ArrayStoreExample
{
    public static void storeObjects()
    {
    	try
    	{
    	Object [] str= new String[5];
        str[0]="hello";
        str[1]="world";
        str[2]=123;
        str[3]="fda";
        str[4]="fhdj";
        System.out.println("objects stored successfully");
        
    	}
    	catch(ArrayStoreException e)
    	{
    	 System.out.println("ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String");	
    	}
    	
    	
    }
	
	
	public static void main(String[] args)
	{
	
    ArrayStoreExample.storeObjects();
	}

}
