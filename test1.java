import java.util.*;
public class test1 {
	public static void main(String args[])
	{
		try
		{
		test1.subroutine();
		}
		catch(NullPointerException e)
		{
			System.out.println("in main "+e);
		}
	}
	
	static void subroutine()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("in sub");
			throw e;
		}
	
		
	}
}
