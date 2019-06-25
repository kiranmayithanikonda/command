package command.java;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int num,c= 0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the num:");
				num=sc.nextInt();
				for(int i=1;i<=num;i++)
				{
					if(num%i==0)
					{
						c++;
					}
				}
					if(c==2)
					{
						System.out.println("Prime");
					}
					else
					{
						System.out.println("Not Prime");
					}
			}
		

	}


