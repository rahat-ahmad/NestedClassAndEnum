package com.classtwo.main;

import java.util.Scanner;

import com.classtwo.enumclass.Day;
import com.classtwo.enumclass.EnumClass;
import com.classtwo.nestedclass.AnnonymousInnerClass;
import com.classtwo.nestedclass.MemberInnerClass;
import com.classtwo.nestedclass.MethodLocalClass;

public class MainClass {

	public void annonymous() {
		AnnonymousInnerClass annonymousInnerClass = new AnnonymousInnerClass() {

			@Override
			public void innerMethod() {
				// TODO Auto-generated method stub
				System.out.println("This is a example of annonymous inner class");

			}
		};
		annonymousInnerClass.innerMethod();

	}

	public void enumTest() {

		String str = "MONDAY";
		EnumClass t1 = new EnumClass(Day.valueOf(str));
		t1.dayIsLike();
	}

	public static void main(String[] args) {
		String number;
		MainClass mainClass = new MainClass();

		MemberInnerClass memberInnerClass = new MemberInnerClass();
		MethodLocalClass methodLocalClass = new MethodLocalClass();

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Press 1 to see the result of Member Inner Class");
			System.out.println("Press 2 to see the result of Annonymous Inner Class");
			System.out.println("Press 3 to see the result of Method Local Inner Class");
			System.out.println("Press 4 to see the result of Enum");

			number = sc.nextLine();
			// TODO Auto-generated method stub
			switch (number) {
			// Case statements
			case "1":
				memberInnerClass.display_Inner();
				break;
			case "2":
				mainClass.annonymous();
				break;
			case "3":
				methodLocalClass.innerMethod();
				break;
			case "4":
				mainClass.enumTest();
				break;

			// Default case statement
			default:
			}
			System.out.println();

		}

	}

}
