package command.java;

import java.util.Scanner;

public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("First Character:");
		char i1=sc.next().charAt(0);
		System.out.println("Second Character:");
		char i2=sc.next().charAt(0);
		if(i1<i2)
		{
			System.out.println(i1+" , "+i2);
		}
		else
		{
			System.out.println(i2+" , "+i1);
		}

	}

}
