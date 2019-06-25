package command.java;

import java.util.Scanner;

public class alphabetlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch1;
		char p;
		Scanner sc=new Scanner(System.in);
		ch1=sc.next().charAt(0);
		if((ch1>='a' && ch1<='z'))
		{
			p=(char)(ch1-32);
			System.out.println(p);
		}
		else if(ch1>='A' && ch1<='Z'){
				p=(char)(ch1+32);
				System.out.println(p);
			
		}
		
	}

}
