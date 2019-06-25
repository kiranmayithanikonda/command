package command.java;

import java.util.Scanner;

public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Character:");
		ch=sc.next().charAt(0);
		if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z'))
		{
			System.out.println("Alphabet");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Characters");
		}

	}

}
