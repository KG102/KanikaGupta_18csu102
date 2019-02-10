import java.util.*;
class Program2{
	public static void main(String[]args)
	{
		int[]arr= new int[10];
		Scanner console= new Scanner(System.in);
		input(arr);
		search(arr);
	}
	static void input(int [] arr)
	{
		Scanner console= new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter element:");
			arr[i]= console.nextInt();
		}
    }
    static int search(int [] arr)
    {
    	Scanner console= new Scanner(System.in);
    	System.out.println("Enter a number to search:");
    	int search= console.nextInt();
    	int index=-1;
    	for(int i=0;i<10;i++)
    	{
    		System.out.println("Display value at arr["+i+"]:"+arr[i]);
    		if(search== arr[i])
    		{
    			index=i;
    		}
    	}
    	System.out.println("index:"+index);	
    	return search;
    }
}