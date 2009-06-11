package com.fipsen.scavenger;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{
	private static Logger log = Logger.getLogger(Client.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "fipsen-core.xml","fipsen-youtube.xml"});
		
		NewsCollectionThread newsCollectionThread = (NewsCollectionThread) context.getBean("newsCollectionThread");
		
		Thread collectionThread = new Thread(newsCollectionThread);
		try
		{
			collectionThread.start();
		}
		catch (Exception e) 
		{
			log.error(e);
			System.exit(0);
		}
		VideoCollectionThread videoCollectionThread = (VideoCollectionThread) context.getBean("videoCollectionThread");
		Thread videoCollector = new Thread(videoCollectionThread);
		try
		{
			videoCollector.start();
		}
		catch (Exception e)
		{
			log.error(e);
			System.exit(0);
		}
		
		TopCelebrityCollectionThread celebrityCollectionThread = (TopCelebrityCollectionThread) context.getBean("topCelebrityDownloaderThread");
		Thread topCelebrityCollector = new Thread(celebrityCollectionThread);
		try
		{
			topCelebrityCollector.start();
		}
		catch (Exception e)
		{			
			log.error(e);
			System.exit(0);
		}
		
	}
}