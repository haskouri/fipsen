package com.fipsen.scavenger.services.download.impl;

import org.apache.log4j.Logger;
import org.curl.CURL;
import org.curl.CurlGlue;
import org.curl.CurlWrite;

import com.fipsen.core.util.IDGenerator;
import com.fipsen.scavenger.services.download.HtmlDownloader;


public class CurlHtmlDownloader extends HtmlDownloader 
{
	protected Logger log = Logger.getLogger(this.getClass());
	
	

	@Override
	public String download() throws Exception {

		CurlGlue cg = new CurlGlue();

		cg.setopt(CURL.OPT_URL, super.getUrl() );
		//Writer w = new CurlFileWriter();

		if (super.getWriter() != null) {
			cg.setopt(CURL.OPT_WRITEFUNCTION, (CurlWrite) super.getWriter());
			int i = cg.perform();
			
			if (i != 0)
			{
				log.error("Error Occured while performing with curl.");
				throw new Exception("download error.");
			}
			
			super.getWriter().setFileName(super.getDownloadDirectory() + IDGenerator.generateOID("")
							+ super.getFileExtension() );
			super.getWriter().write( super.getWriter().getText());

			log.info("file name is: " + super.getWriter().getFileName());
			return getWriter().getFileName();

		}
		else
		{
			cg.perform();
			return null;
		}
		
		
	}

}
