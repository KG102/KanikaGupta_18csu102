import java.io.*;
class FileDemoReader
{
	public static void main(String[]args)
	{
	  File f=null;
	  String strs=  "Kanika.txt";
	  try
	  {
		f= new File(strs);
		FileReader fin= new FileReader(f);
		BufferedReader bin= new BufferedReader(fin);
		String sr;
		System.out.println("The contents of the file are: ");
		while((sr=bin.readLine())!=null)
		{
			//sr=bin.readLine();
			System.out.println(sr);
		}
		bin.close();
	  }
      catch(Exception e){e.printStackTrace();}
    }

}