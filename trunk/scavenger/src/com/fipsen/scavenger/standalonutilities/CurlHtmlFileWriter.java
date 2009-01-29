package com.fipsen.scavenger.standalonutilities;

import org.apache.log4j.Logger;
import org.curl.CurlWrite;

import com.fipsen.core.util.Writer;

public class CurlHtmlFileWriter extends Writer implements CurlWrite
{
	protected Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public int handleString(byte[] arg0) 
	{
		String s ="";
		for (byte b : arg0) 
		{
			//System.out.print((char)b);
			s = s + (char)b;
			//s = s + (char)b;			
		}
	
				
		super.setText(	
				super.getText()==null ? s : super.getText()+s
					);
		
		return 0;
	}

}
