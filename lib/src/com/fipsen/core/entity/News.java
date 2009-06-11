package com.fipsen.core.entity;

public class News extends AbstractEntity
{
	private String heading;
	private String details;
	private String date;
	private String time;
	private String newsurl;
	private Image leadImage;

	public Image getLeadImage()
	{
		return leadImage;
	}

	public void setLeadImage(Image leadImage)
	{
		this.leadImage = leadImage;
	}

	public String getHeading()
	{
		return heading;
	}

	public void setHeading(String heading)
	{
		this.heading = heading;
	}

	public String getDetails()
	{
		return details;
	}

	public void setDetails(String details)
	{
		this.details = details;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getTime()
	{
		return time;
	}

	public void setTime(String time)
	{
		this.time = time;
	}

	public String getNewsurl()
	{
		return newsurl;
	}

	public void setNewsurl(String newsurl)
	{
		this.newsurl = newsurl;
	}

}
