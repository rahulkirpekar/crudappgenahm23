package com.crudappgenahm23.util;

public class StringUtils 
{
	public static boolean isValidString(String msg) 
	{
		if((msg != null) && (msg.trim().length() > 0)) 
		{
			return true;
		}
		return false;
	}
}
