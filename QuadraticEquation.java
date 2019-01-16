import java.util.*;
class QuadraticEquation
{
	public static void main(String[]args)
	{
		int a,b,c;
		double root1,root2,dis;
		Scanner console= new Scanner(System.in);
		System.out.print("Enter a:");
		a= console.nextInt();
		System.out.print("Enter b:");
		b= console.nextInt();
		System.out.print("Enter c:");
		c= console.nextInt();
		System.out.println("Given quaratic equation will be: "+a+"x^2+"+b+"x+"+c+"");
		dis= (b*b)-(4*a*c);
		if(dis>0)
		{
			System.out.println("Roots are real and distinct");
			root1= (-b + Math.sqrt(dis))/(2*a);
			root2= (-b - Math.sqrt(dis))/(2*a);
			System.out.println("First root is:"+root1);
			System.out.println("Second root is:"+root2);

		}
		else if(dis==0)
		{
			System.out.println("Roots are real and equal");
			root1= (-b)/(2*a);
			System.out.println("Root is:"+root1);
		}
		else if(dis<0)
		{
			System.out.println("Roots are imaginary");

		}

	}
}