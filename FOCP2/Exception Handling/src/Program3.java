import java.lang.Exception;
class Program3
{
	public static void main(String[]args)
	{
		try
		{
			
			Exception e= new Exception("Not Valid");
			throw e;
		}
		catch(Exception e){System.out.println(e.getMessage());}
		finally{System.out.println("You were there");}
	}
}