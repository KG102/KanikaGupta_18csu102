import java.util.*;
class Program5
{
	public static void main(String[]args)
	{
		int i,j,k=0,size1,size2,size;
		int[]arr1= new int[50];
		int[]arr2= new int[50];
		int[]arr3= new int[100];
		Scanner console= new Scanner(System.in);
		System.out.print("Size of array1:");
		size1= console.nextInt();
		System.out.println("Enter array1 elements:");
		for(i=0;i<size1;i++)
		{
			arr1[i]= console.nextInt();
		}
		System.out.print("Size of  array2:");
		size2= console.nextInt();
		System.out.println("Enter array2 elements:");
		for(j=0;j<size2;j++)
		{
			arr2[j]= console.nextInt();
		} 
		System.out.println("Merging the arrays:");
		for(i=0;i<size1;i++)
		{
			arr3[i]=arr1[i];
			
		}
		size= size1 + size2;
		for(j=0,k=size1;k<size&&j<size2;j++,k++)
		{
			arr3[k]=arr2[j];
		}
		System.out.println("The new array after merging is:");
		for(i=0;i<size;i++)
		{
			System.out.println(" "+arr3[i]);
		}
	}
}