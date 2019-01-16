import java.util.*;
class Month
{
	public static void main(String[]args)
	{
		Scanner console= new Scanner(System.in);
		int num;
		char ch;
		do
		{
		  System.out.print("Enter a number from 1-12:");
		  num= console.nextInt();
		  switch(num)
		    {
			  case 1: System.out.println("January");
			        break;
			  case 2: System.out.println("February");
			        break;
			  case 3: System.out.println("March");
			        break;
			  case 4: System.out.println("April");
			        break;
			  case 5: System.out.println("May");
			        break;
			  case 6: System.out.println("June");
			        break;
			  case 7: System.out.println("July");
			        break;
			  case 8: System.out.println("August");
			        break;
			  case 9: System.out.println("September");
			        break;
			  case 10: System.out.println("October");
			         break;
			  case 11: System.out.println("November");
			         break;
			  case 12: System.out.println("December");
			         break;
			  default: System.out.println("Invalid number");
			         break;
		    }
		    System.out.print("Do you want to repeat:");
		    ch= console.next().charAt(0);
		}
		while(ch== 'y' || ch== 'Y');
    }
}