class Box
{
	double width;
	double height;
	double depth;
	Box(double w, double h,double d)
		{
		  this.width= w;
		  this.height= h;
		  this.depth=d;
	    }
	
	Box()
	{
		
		
			width= 1;
			height= 2;
			depth= 3;
		

	}
	double volume()
	{
		double volume;
		volume= width*height*depth;
		return volume;
	}
	void setDim()
	{
		width=5;
		height=6;
		depth=7;
		System.out.println("width="+width);
		System.out.println("height="+height);
		System.out.println("depth="+depth);
	}
}
class BoxDemo
{
	public static void main(String[]args)
	{
	  Box b= new Box();
	  b.setDim();
	  double vol;
	  vol= b.volume();
	  System.out.print("Volume is: "+vol);
	  Box d= new Box(10,11,12);
	  double vol1= d.volume();
	  System.out.print("Volume is: "+vol1);
    }
}