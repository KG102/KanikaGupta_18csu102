class SecondLargestElement
{
	public static void main(String args[])
	{
		
	int arr[]={1,2,3};
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("array is:" +arr[i]);

	}
	
    
        int sum = 0;
        for (int e : arr) sum += e;
        System.out.println("sum is "+sum);
	int max=arr[0];
	int min=arr[0];
	int second_largest=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
		if(arr[i]>max)
		{
			second_largest=arr[i];
			max=arr[i];
		}
		if(arr[i]>second_largest)
		{
			arr[i]=second_largest;
		}

	}
	System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
		System.out.println("second largest Number in a given array is : " +second_largest);
	}

}
