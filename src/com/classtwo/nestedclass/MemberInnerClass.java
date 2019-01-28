package com.classtwo.nestedclass;

public class MemberInnerClass {
	
	int num;
	   
	   // inner class
	   private class InnerClass {
	      public void print() {
	         System.out.println("Calling from the inner class");
	      }
	   }
	   
	  public void display_Inner() {
	      InnerClass innerClass = new InnerClass();
	      innerClass.print();
	   }

}
