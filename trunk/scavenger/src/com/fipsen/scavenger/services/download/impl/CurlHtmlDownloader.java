package com.fipsen.scavenger.services.download.impl;

import org.curl.CURL;
import org.curl.CurlGlue;

import com.fipsen.scavenger.services.download.HtmlDownloader;

public class CurlHtmlDownloader implements HtmlDownloader {

	@Override
	public void download() throws Exception 
	{
		CurlGlue cg = new CurlGlue();
		cg.setopt(CURL.OPT_URL, "http://www.google.com/");
		//cg.setopt(CURL.OPT_WRITEFUNCTION, new MyWriter());
		//cg.setopt(option, value)
		
		int i = cg.perform();
		System.out.println("value: "+i);
		if (i != 0)
		{
			throw new Exception("download error.");
		}
		
		
		System.out.println(cg);

	}

}
