package com.Harshitha.sl.Assignements;
 class OuterClass {
	  int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
	}
public class InnerClassMain {
	  public static void main(String[] args) {
		    OuterClass myOuter = new OuterClass();
		    OuterClass.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.y + myOuter.x);
		  }
		}



