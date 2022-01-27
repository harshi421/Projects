package com.Harshitha.sl.Assignements;
import java.util.regex.Pattern;
public class RegularExpressions {

		public static void main(String args[])
		{
            System.out.println(Pattern.matches("Bhavana", "Bhavana"));// it returns true as the strings match
			System.out.println(Pattern.matches("Bhavana", "Bhav"));// it returns false as the strings does not match

		}
	}


