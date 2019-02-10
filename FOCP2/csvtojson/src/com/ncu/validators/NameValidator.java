package com.ncu.validators;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.util.*;
import com.ncu.exceptions.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class NameValidator
{
	public boolean nameValidator(String filename,String filetype)
	{
		System.out.println("File name is: " +filename+" and its type is: "+filetype);
		boolean b;
		Properties prop= new Properties();
		FileInputStream input=null;
		Logger logger= Logger.getLogger(NameValidator.class);
		PropertyConfigurator.configure("C:/Java Programs/FOCP2/csvtojson/configs/logger/logger.properties");
		try
		{
			input= new FileInputStream("C:/ Java Programs/FOCP2/csvtojson/configs/constants/Exceptions.properties");
			prop.load(input);
		  b=emptyFileName(filename);
		}
		catch(Exception e)
		{
			logger.error("\n \n"+e+prop.getProperty("emptyNameMessage"));
				return false;
		} 
		b=missingDot(filename);
		if(b==true)
			return false;
		b=fileformat(filename);
		if(b==true)
			return false;
		b=fileLength(filename);
		if(b==true)
			return false;
		b=specialCharacter(filename);
		if(b==true)
			return false;
		if(filetype=="csv")
		{
			b=csvOnly(filename);
			if(b==true)
				return false;
		}
		else
		{
			b=jsonOnly(filename);
			if(b==true)
				return false;
		}
		b=fileNotAvailable(filename);
		if(b==true)
			return false;
		b=fileExist(filename);
		if(b==true)
			return false;

		return true;
	}
	boolean emptyFileName(String filename) throws EmptyFileNameException
	{
		if(filename==""){
			throw new EmptyFileNameException("");
		}
		return false;
	}
	boolean missingDot(String filename)
	{
		 Pattern costPattern= Pattern.compile("[.]");
		 Matcher costMatcher= costPattern.matcher(filename);
		 boolean value= costMatcher.find();
         if(value==true)
         {
         	return false;
         }
         else
         {
         	return true;
         }
	}
	boolean fileformat(String filename)
	{
		String[]extn= filename.split("\\.");
		if(extn.length<=1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean fileLength(String filename)
	{
		int fileLength=25;
		String nameLength= filename.split("\\.")[0];
		if(nameLength.length()>fileLength)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean specialCharacter(String filename)
	{
		filename= filename.split("\\.")[0];
		Pattern patternGet= Pattern.compile("[@#$%^&(,)_]");
		Matcher check= patternGet.matcher(filename);
		boolean finalValue= check.find();
		if(finalValue==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean csvOnly(String filename)
	{
		String name= filename.split("\\.")[1];
		if(name.equals("csv")==true)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	boolean jsonOnly(String filename)
	{
		String[]name= filename.split("\\.");
		if(name[1].equals("json")==true)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	boolean fileNotAvailable(String filename)
	{
		File f= new File(filename);
		if(f.exists()==true)
			return false;
		else
			return true;
	}
	boolean fileExist(String filename)
	{
		File f= new File("./"+filename);
		if(f.exists()==true)
			return true;
		else
			return false;
	}
}