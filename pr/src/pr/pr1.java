package pr;

import java.util.Scanner;

public class pr1 {
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Enter two numbers:=");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		
		c=a*b;
		System.out.println("Multiplication:="+c);
	}

}
