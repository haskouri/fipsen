package com.fipsen.core.entity;

public class Image extends AbstractEntity
{
	private int type;
	private String path;
	private String url;
	private String altertag;
	private String title;
	private String referenceid;

	public int getType()
	{
		return type;
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getAltertag()
	{
		return altertag;
	}

	public void setAltertag(String altertag)
	{
		this.altertag = altertag;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getReferenceid()
	{
		return referenceid;
	}

	public void setReferenceid(String referenceid)
	{
		this.referenceid = referenceid;
	}

}
