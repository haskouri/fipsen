package com.fipsen.scavenger.services.download.impl;

import org.apache.log4j.Logger;
import org.curl.CURL;
import org.curl.CurlGlue;
import org.curl.CurlWrite;

import com.fipsen.core.util.IDGenerator;
import com.fipsen.core.util.Writer;
import com.fipsen.scavenger.services.download.HtmlDownloader;


public class CurlHtmlDownloader implements HtmlDownloader 
{
	protected Logger log = Logger.getLogger(this.getClass());
	
	private Writer writer;
	private String url;
	private String downloadDirectory;
	private String fileExtension;

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDownloadDirectory() {
		return downloadDirectory;
	}

	public void setDownloadDirectory(String downloadDirectory) {
		this.downloadDirectory = downloadDirectory;
	}
	

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	@Override
	public void download() throws Exception {

		CurlGlue cg = new CurlGlue();

		cg.setopt(CURL.OPT_URL, url);
		//Writer w = new CurlFileWriter();

		if (writer != null) {
			cg.setopt(CURL.OPT_WRITEFUNCTION, (CurlWrite) writer);
			int i = cg.perform();
			
			if (i != 0)
			{
				log.error("Error Occured while performing with curl.");
				throw new Exception("download error.");
			}
			
			writer.setFileName(downloadDirectory + IDGenerator.generateOID("")
							+ fileExtension);
			writer.write(writer.getText());

			log.info("file name is: " + writer.getFileName());

		}
		else
		{
			cg.perform();
		}
		
		
	}

}
