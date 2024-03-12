//Program to read a no and display
import java.io.*;

class ReadNo
{
	public static void main(String args[])throws Exception
	{
		int no=0;

		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);

		System.out.print("Enter a no:");
		no=Integer.parseInt(br.readLine());

		System.out.println(no);
	}
}