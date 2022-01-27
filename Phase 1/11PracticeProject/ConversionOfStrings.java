package com.Harshitha.sl.Assignements;

public class ConversionOfStrings {
	
		public static void main(String[] args) {
	        String str = "String to StringBuilder StringBuffer";
	        
	        /*
	         * To convert String to StringBuilder/StringBuffer
	         * use the constructor.
	         * 
	         * public StringBuilder(String str) 
	         * OR
	         * public StringBuffer(String str)
	         */
	        
	        StringBuilder sbl = new StringBuilder(str);
	        System.out.println("StringBuilder contents: " + sbl);
	        
	        StringBuffer sbf = new StringBuffer(str);
	        System.out.println("StringBuffer contents: " + sbf);

		}

	}


