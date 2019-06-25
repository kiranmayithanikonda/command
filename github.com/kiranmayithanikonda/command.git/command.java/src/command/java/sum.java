package command.java;


public class sum {

	public static void main(String[] args) {
		int int1,int2,sum;
		int1=Integer.parseInt(args[0]);
		int2=Integer.parseInt(args[1]);
		sum=int1+int2;
		System.out.println("The sum of int1 and int2 is"+" "+sum);
		}

}
