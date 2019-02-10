
	class DistanceDemo
{
		public static void main(String[]args)
	{
		Distance d1= new Distance();
		Distance d2= new Distance(20,30);
		double dis= Distance.CalculateDistance(d1,d2);
		System.out.println("Distance is: "+dis);


	}
}
