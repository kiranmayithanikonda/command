package command.java;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234,r=0,remainder=0,s=0;
		r=n;
		while(n!=0)
		{
			remainder=n%10;
			r=r*10+remainder;
			n=n/10;
		}
		if(s==r)
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
