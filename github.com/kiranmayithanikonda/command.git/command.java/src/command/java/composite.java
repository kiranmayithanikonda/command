package command.java;

public class composite {

	public static void main(String[] args) {
		int n=0,i,c=0;
		if(n==1||n==0)
			System.out.println(n+" is neither prime nor composite");
		else 
		{
		for(i=1;i<n;i++)
			if(n%i==0)
				c++;
		if(c==2)
			System.out.println("prime");
		else
			System.out.println("not prime");
			
		}

	}

}
