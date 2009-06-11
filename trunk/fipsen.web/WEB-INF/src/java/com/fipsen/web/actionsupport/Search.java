package com.fipsen.web.actionsupport;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Search extends BaseActionSupport
{
	protected Logger log = Logger.getLogger(this.getClass());
	
	private int size;
	private String url;
	private String key;
	private String notice;

	
	public String getNotice()
	{
		return notice;
	}

	public void setNotice(String notice)
	{
		this.notice = notice;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getKey()
	{
		return key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public String search() throws Exception
	{
		int methodFailedCount = 0;

		if (key.contains(" "))
		{
			key = key.replaceAll(" ", "%20");
		}
		
		String request = "http://api.search.yahoo.com/WebSearchService/V1/webSearch?appid=Fipsen&query=%22"
				+ key + "%22&site=wikipedia.org&results=1";

		// "http://search.yahooapis.com/WebSearchService/V1/webSearch?appid=YahooDemo&query=madonna&site=wikipedia.org"

		// ;

		HttpClient client = new HttpClient();

		GetMethod method = new GetMethod(request);

		// Send GET request

		int statusCode = HttpStatus.SC_BAD_REQUEST;
		try
		{
			statusCode = client.executeMethod(method);
		}
		catch (Exception e)
		{
			log.error(e);
			return ERROR;
		}

		if (statusCode != HttpStatus.SC_OK)
		{

			methodFailedCount += 1;

			System.err.println("Method failed: " + method.getStatusLine()
					+ "; count:" + methodFailedCount);
			this.notice = "An Error Occured, Please Try Again.";
			return ERROR;

		}

		InputStream rstream = null;

		// Get the response body

		rstream = method.getResponseBodyAsStream();

		// Process response

		Document response = DocumentBuilderFactory.newInstance()

		.newDocumentBuilder().parse(rstream);

		XPathFactory factory = XPathFactory.newInstance();

		XPath xPath = factory.newXPath();

		// Get all search Result nodes

		NodeList nodes = (NodeList) xPath.evaluate("/ResultSet/Result",

		response, XPathConstants.NODESET);

		int nodeCount = nodes.getLength();

		if (nodeCount == 0)
		{
			this.notice = "No Result Found with the Key.";
			return ERROR;
		}
		// iterate over search Result nodes

		for (int i = 0; i < size; i++)
		{

			// Get each xpath expression as a string

			String title = (String) xPath.evaluate("Title", nodes.item(i),

			XPathConstants.STRING);

			String summary = (String) xPath.evaluate("Summary", nodes.item(i),

			XPathConstants.STRING);

			String url = (String) xPath.evaluate("Url", nodes.item(i),

			XPathConstants.STRING);

			this.url = url;
		}

		return SUCCESS;
	}

}
