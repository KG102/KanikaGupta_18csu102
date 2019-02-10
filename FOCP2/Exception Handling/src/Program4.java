import java.lang.Exception;
class Program4
{
	public void method1()
	{
		System.out.println("Exception Handling");
	}
	public static void main(String[]args)
	{
		try
		{
		   Program4 s= null;
		   s.method1();
		}
		catch(NullPointerException e){System.out.println(e);}
		System.out.println("rest of the code...");
    }	
}