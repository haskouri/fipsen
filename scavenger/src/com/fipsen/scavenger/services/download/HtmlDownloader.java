//package com.fipsen.scavenger.services;
package com.fipsen.scavenger.services.download;

import com.fipsen.core.util.Writer;

public abstract class HtmlDownloader 
{
	private Writer writer;
	private String url;
	private String downloadDirectory;
	private String fileExtension;

	public Writer getWriter() 
	{
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
	
	
	public abstract String download() throws Exception;

}
