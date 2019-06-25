package command.java;

public class prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i;
		for(i=10;i<=99;i++)
		{
			num=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					num++;
				}
			}
			if(num==2)
			{
				System.out.println(i);
			}
		}

	}

}
