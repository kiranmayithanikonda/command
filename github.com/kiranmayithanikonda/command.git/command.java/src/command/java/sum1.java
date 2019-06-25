package command.java;

import java.util.Scanner;

public class sum1 {

		public static void main(String[] args) {
			int n,s,c=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers:");
			n=sc.nextInt();
			while(n>0)
			{
				s=n%10;
				c=c+s;
				n=n/10;
			}
			System.out.println(c);
	}

}
