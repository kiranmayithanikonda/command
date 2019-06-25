package command.java;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rev=0;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+(n%10);
			n=n/10;
			
		}
		System.out.println(+rev);
		
	}

}
