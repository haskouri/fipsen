package com.fipsen.scavenger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fipsen.scavenger.services.download.HtmlDownloader;

public class Client 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "fipsen-core.xml" });

		HtmlDownloader htmlDownloader = (HtmlDownloader) context.getBean("downloader");
		try 
		{
			htmlDownloader.download();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
