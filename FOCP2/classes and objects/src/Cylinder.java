class Cylinder extends Circle
{
	private double height;
	public Cylinder()
	{
		super();
		this.height= 1.0;
	}
	public Cylinder(double r)
	{
		super(r);
		this.height= 1.0;
	}
	public Cylinder(double r,double h)
	{
		super(r);
		this.height= h;
	}
	public Cylinder(double r,double h,String c)
	{
		super(r,c);
		this.height= h;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double h)
	{
       this.height= h;
	}
	public double getVolume()
	{
		return super.getArea()*height;
	}


