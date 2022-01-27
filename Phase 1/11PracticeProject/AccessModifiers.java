package com.Harshitha.sl.Assignements;

public class AccessModifiers {
	   public void meth1() {
			System.out.println("public access modifiers implemt");
		}
		private void meth2() {
			System.out.println("private access modifiers implemt");
		}
		 void meth3() {
			System.out.println("default access modifiers implement");
		}
		 protected void meth4() {
			 System.out.println("protected access modifiers implement");
		 }

		public static void main(String[] args) {
			 AccessModifiers am=new AccessModifiers();
			  am.meth1() ;
			  am.meth2();
			  am.meth3();
			  am.meth4();
         }
}



