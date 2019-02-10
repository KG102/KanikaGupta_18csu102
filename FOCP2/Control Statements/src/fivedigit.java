import java.util.*;
class FiveDigit
{
	public static void main(String args[])
	{
		int num,digit1,digit2,digit3,digit4,digit5;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a 5 digit number");
 num=scan.nextInt();
 if(num>=10000 && num<=99999)
 {
	digit1=num/10000;
	digit2=(num%10000)/1000;
	digit3=(num%1000)/100;
	digit4=(num%100)/10;
	digit5=(num%10);
	System.out.println(digit1+ "\t");
	System.out.println(digit2+ "\t");
	System.out.println(digit3+ "\t");
	System.out.println(digit4+ "\t");
	System.out.println(digit5+ "\t");
}
else
{
	System.out.println("invalid number");
	}
}
}
