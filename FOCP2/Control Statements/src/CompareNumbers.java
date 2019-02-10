import java.util.*;
class CompareNumbers
{
	public static void main(String[]args)
	{
		double a,b;
		Scanner c= new Scanner(System.in);
		System.out.print("Enter first number:");
		a= c.nextDouble();
		System.out.print("Enter second number:");
		b= c.nextDouble();
		a= Math.round(a*1000);
		a= a/1000;
		b= Math.round(b*1000);
		b=b/1000;
		if(a==b)
		{
			System.out.println("They are same upto three decimal places.");
		}
		else
		{
			System.out.println("They are different.");
		}

	}
}