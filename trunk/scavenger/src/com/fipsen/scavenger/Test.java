package com.fipsen.scavenger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.curl.CURL;
import org.curl.CurlGlue;
import org.curl.CurlWrite;

import com.fipsen.core.dao.ImageDAO;
import com.fipsen.core.dao.hibernate.ImageDAOHibernate;
import com.fipsen.core.entity.Image;
import com.fipsen.core.util.IDGenerator;

public class Test implements CurlWrite {
	
	String s = "";
private List<Byte> myByte = new ArrayList<Byte>();
	
	public void putByte(byte aByte)
	{
		myByte.add(aByte);		
	}

	public byte[] getByteArray()
	{
		ByteBuffer buffer = ByteBuffer.allocate(myByte.size());
		byte[] testbyte = buffer.array();
	
		for(int i = 0; i<myByte.size(); i++ ) 
		{
			testbyte[i] = myByte.get(i);		 	
		}
		
		
		return testbyte;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		//imageWriting();
		dbTest();
		
	}
	
	private static void dbTest()
	{
		Image i = new Image();
		String test = "test";
		i.setAltertag(test);
		i.setOid(IDGenerator.generateOID("test").substring(0,18));
		i.setPath(test);
		i.setReferenceid(test);
		i.setTitle(test);
		i.setType(1);
		i.setUrl(test);
		
		ImageDAO d = new ImageDAOHibernate();
		try
		{
			d.save(i);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void imageWriting()
	{
		CurlGlue cg = new CurlGlue();
		cg.setopt(CURL.OPT_URL, "http://www.google.com.bd/images/nav_logo3.png");
		
		Test t = new Test();
		cg.setopt(CURL.OPT_WRITEFUNCTION, t);
		
		cg.perform();
		
		try {
			t.writeImage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int handleString(byte[] arg0) {
		//String s ="";
		for (byte b : arg0) 
		{
			putByte(b);
		}
		
		
		return 0;
	}
	
	public void write()
	{
		java.io.Writer output = null;
		try {
			output = new BufferedWriter(new FileWriter("test.html"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {			
			output.write(s);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	
	public void writeImage()throws Exception
	{
		OutputStream out = new java.io.FileOutputStream( "test1.png" );
		try {
		      out.write( getByteArray() );
		    }
		    finally {
		      out.flush();
		      out.close();
		    }
	}

}
