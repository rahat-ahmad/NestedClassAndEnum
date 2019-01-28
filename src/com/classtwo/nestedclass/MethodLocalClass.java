package com.classtwo.nestedclass;

public class MethodLocalClass {
	
	public void innerMethod() {

	      // method-local inner class
	      class InnerMethod {
	         public void print() {
	            System.out.println("Calling from the method inner class");	   
	         }   
	      } // end of inner class
		   
	      // Accessing the inner class
	      InnerMethod innerMethod = new InnerMethod();
	      innerMethod.print();
	   }

}
