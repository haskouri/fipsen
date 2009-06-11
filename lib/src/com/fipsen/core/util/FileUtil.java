package com.fipsen.core.util;

import java.io.File;

import org.apache.log4j.Logger;

public class FileUtil
{
	private static Logger log = Logger.getLogger(FileUtil.class);
	public static boolean deleteFile(String filePath)
	{
		File f = null;
		boolean isDeleted = false;
		try
		{
			f = new File(filePath);
		}
		catch (Exception e)
		{
			//e.printStackTrace();
			log.error(e);
			return false;
		}
		
		try
		{
			isDeleted = f.delete();
			if (isDeleted)
			{
				log.info("file deleted from location : " + f.getAbsolutePath());
			}
		}
		catch (Exception e)
		{
			log.error( "file could not be deleted. " , e);
		}
		return isDeleted;
	}

}
