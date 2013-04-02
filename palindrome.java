package com.test.palindrome;

import java.util.Scanner;

public class Palindrome {

  /**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int x = sc.nextInt();
		if (isPalindrome(x) == true)
	    	  System.out.println(Integer.toString(x)+ " is a palindrome.");
		else
	    	  System.out.println(Integer.toString(x)+ " is not a palindrome");
			
		
	}



	public static boolean isPalindrome(int x)
	{
		String reverse = "";

		String s = Integer.toString(x);

	      for ( int i = s.length() - 1 ; i >= 0 ; i-- )
	      {
	         reverse = reverse + s.charAt(i);
	      }

	      if (s.equals(reverse))
	    	  return true;
	      else
	    	  return false;
	}

}
