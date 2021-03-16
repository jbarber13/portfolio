/**
 * TestSrv.java -- service methods to validate test cases in the SearchDrv test driver. 
 *
 * @author  Jeff Pittges 
 * @version 22-Feb-2013  updated 28-Jul-2015 by Shawn Brenneman
 */
public class TestSrv
{
	public String validate(int expected, int actual)
	{
		String result = "Fail";
		if (expected == actual) 
		   result = "Pass";
		return result; 
	}

	public String validate(boolean expected, boolean actual)
	{
		String result = "Fail";
		if (expected == actual) 
		   result = "Pass";
		return result; 
	}

	public String validate(int[] expected, int[] actual)
	{
		String  result = "Fail";
		boolean pass = true;

		if (expected.length != actual.length)
		   pass = false; 

		int i = 0; 
		while (pass && i < actual.length)
		{
			if (expected[i] != actual[i])
			   pass = false; 
			++i; 
		}

		if (pass)
		   result = "Pass"; 

		return result; 
	}
}

