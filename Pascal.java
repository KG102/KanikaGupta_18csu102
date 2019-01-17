import java.util.*;
class Pascal
{
	public static void main(String[]args)
	{
		int i,j,blk,no_row,c=1;
		Scanner p= new Scanner(System.in);
		System.out.print("Input the number of rows:");
		no_row= p.nextInt();
		for(i=0;i<no_row;i++)
		{
			for(blk=1;blk<no_row-i;blk++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				if(j==0||i==0)
					c=1;
				else
					c=c*(i-j+1)/j;
				System.out.print(" "+c );
			}
			System.out.print("\n");
		}
	}
}