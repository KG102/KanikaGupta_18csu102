import com.ncu.validators.*;
public class TestNameValidator
{
	public static void main(String[]args)
	{
		NameValidator csvObject= new NameValidator();
		boolean checkValidator= csvObject.nameValidator("example.csv","csv");
		System.out.println(checkValidator);
		checkValidator= csvObject.nameValidator("","csv");
		System.out.println(checkValidator);
		checkValidator= csvObject.nameValidator("example","csv");
		System.out.println(checkValidator);
		checkValidator= csvObject.nameValidator("example.csv","csv");
		System.out.println(checkValidator);
		checkValidator= csvObject.nameValidator("example1234567893464564423.csv","csv");
		System.out.println(checkValidator);
		checkValidator= csvObject.nameValidator("example@123.csv","csv");
		System.out.println(checkValidator);
		checkValidator= csvObject.nameValidator("example.doc","json");
		System.out.println(checkValidator);
	}
}