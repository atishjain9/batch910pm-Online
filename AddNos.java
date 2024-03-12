//program to add two nos
// scanner class is introduced from jdk 5 
import java.util.Scanner;

class AddNos
{
	public static void main(String args[])
	{
		int no1,no2,res;
		no1=no2=res=0;

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter First no:");
		no1=sc.nextInt();

		System.out.print("Enter Second no:");
		no2=sc.nextInt();

		res=no1+no2;

		System.out.println("Result is:"+res);
        System.out.println(no1 + " + " + no2 + " = " +res);
        System.out.printf("%d + %d = %d",no1,no2,res);

	}
}