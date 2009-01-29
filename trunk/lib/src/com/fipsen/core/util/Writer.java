package com.fipsen.core.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Writer 
{
	public Writer(){}
	private String fileName;	
	
	public String getFileName() 
	{
		return fileName;
	}
	public void setFileName(String fileName) 
	{
		this.fileName = fileName;
	}
	
	private String text;
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	public void write(String text)  throws IOException
	{
		if (this.getFileName().equals(null))
		{
			System.out.println("no file declared to write. writing to console.");
			System.out.println(text);
		}
		else
		{
			write(this.getFileName(), text);
		}
		
	}
	/**
	 * This method writes the raw text to supplied file.
	 * @param fileName to write.
	 * @param text to append in the file.
	 * @throws IOException
	 */
	public void write(String fileName,String text) throws IOException 
	{
		java.io.Writer output = new BufferedWriter(new FileWriter(fileName));
		try {			
			output.write(text);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			output.close();
		}	
	}
	
	/*public void write(String fileName) throws IOException
	{
		this.write(fileName, this.getText());
	}*/

	
	
}
