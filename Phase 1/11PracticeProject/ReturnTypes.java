//4th Program//

package com.Harshitha.sl.Assignements;

public class ReturnTypes {
	int m1()
		  { 
		   System.out.println("m1 method") ;

		      return 10; 
		} 

		  float m2() 
		  { 
		    System.out.println("m2 method"); 
		      return 50.5f; 
		  } 

		  static char m3()
		  { 
		    System.out.println("m3 method"); 
		     return 'a'; 
		  } 
		double m4() 
		{
		System.out.println("m4 method"); 
		return 50.5d;
		}
	    String m5() 
		{
		  System.out.println("m5 method"); 
		    return "bhavana";

		}
		long m6() 
		{
		 System.out.println("m6 method"); 
		 return 1000000000;
		}
	public static void main(String[] args) {
		 {  
			   ReturnTypes s = new ReturnTypes(); 
			   int x = s.m1(); 
			   System.out.println("Return value of m1()= " +x); 
	           float y = s.m2();
			   System.out.println("Return value of m2()= " +y); 
			   char ch = ReturnTypes.m3(); 
			   System.out.println("Return value of m3()= " +ch); 
               double d1 = s.m4() ;
			   System.out.println("Return value of m4()= " +d1); 
			   String str = s.m5() ;
			   System.out.println("Return value of m5()= " +str); 
			   long l = s.m6() ;
			   System.out.println("Return value of m6()= " +l); 
		 }
	}
}




