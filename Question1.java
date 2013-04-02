package com.test.project;

public class Test {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<101; i++)
		{
			if(multipleofthree(i) == true && multipleoffive(i) == true)
			{
				System.out.println("AaaBbb");
			}
			else if(multipleofthree(i) == true)
			{
				System.out.println("Aaa");
			}
			else if (multipleoffive(i) == true)
			{
				System.out.println("Bbb");
			}
			else
			{
				System.out.println("i");
			}
		}

	}
	
	
	
	
	public static boolean multipleofthree(int i)
	{
		if(i%3 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean multipleoffive(int i)
	{
		if(i%5 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
