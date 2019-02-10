package com.ncu.exceptions;;
public class FileAlreadyExistException extends Exception
{
	FileAlreadyExistException(String s)
	{
		super(s);
	}
}