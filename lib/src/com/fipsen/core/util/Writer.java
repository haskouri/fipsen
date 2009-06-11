package com.fipsen.core.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;


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
	private byte[] byteArray;
	
	public byte[] getByteArray() 
	{
		//ByteBuffer bb = ByteBuffer.allocate(byteArray.size());
		//byte[] b = new byte[byteArray.size()];
		
		return  byteArray;
	}
	
	public void setByteArray(byte[] b) 
	{
		
		this.byteArray = b;
	}
	
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
	
	public void write(byte[] byteArray)  throws IOException
	{
		if (this.getFileName().equals(null))
		{
			System.out.println("no file declared to write. writing to console.");
			System.out.println(text);
		}
		else
		{
			write(this.getFileName(), byteArray);
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
			this.text = null;
			output.close();
		}	
	}
	public void write(String fileName,byte[] bytes) throws IOException 
	{
		java.io.OutputStream output = new FileOutputStream(fileName);
		try {			
			output.write(bytes);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//this.setByteArray(null);// = null;
			byte[] nullBytes = null;
			this.setByteArray(nullBytes);
			this.text = null;
			output.close();
		}	
	}
	
	/*public void write(String fileName) throws IOException
	{
		this.write(fileName, this.getText());
	}*/

	
	
}
