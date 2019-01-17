import java.util.*;
class Pattern
{
	public static void main(String[]args)
	{
		int no_rows,i,j,k;
		char ch='A';
		Scanner p= new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		no_rows= p.nextInt();
		int counter=0;
		for(i=0;i<=(no_rows*2);i++)
		{
			ch='A';

			
			for(int a=counter;a<(no_rows);a++)
			{
				System.out.print(" ");
			}
			for(j=0;j<counter;j++)
			{
				System.out.print(ch);
				ch++;
			}
			for(k=counter;k>=0;k--)
			{
				
				System.out.print(ch);
				ch--;
			}
			System.out.print("\n");
			if(i>=no_rows)
			{
				counter--;
			} else
			{
				counter++;
			}
		}
		/*for(i=no_rows;i>=0;i--)
		{
			ch--;
			for(j=0;)
		}
		*/
	}
}