package com.fipsen.core.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;

public class StringProcessorUtil
{
	private static Logger log = Logger.getLogger(StringProcessorUtil.class);
	
	public static String generateNewsURL(String strToProcess)
	{
		String s = "";
		try
		{
			URL url = new URL(strToProcess);
			s = url.getPath();
			//System.out.println(s);
			s = s.replace("/", "");
		}
		catch (MalformedURLException e)
		{
			s = IDGenerator.generateOID("");
			log.error(e);
		}
		return s;
	}

	public static void main(String[] args)
	{
		String s = generateNewsURL("http://www.celebuzz.com/amy-winhouse-spliffing-st-lucia-s84041/");
		
		System.out.println(s);
	}
}
