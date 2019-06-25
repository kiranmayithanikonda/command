package command.java;

import java.util.Scanner;

public class pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a given number:");
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("is a positive number");
		}
		else if(a<0)
		{
			System.out.println("is a negative number");
		}
		else
		{
			System.out.println("is a zero");
		}
	}

}
