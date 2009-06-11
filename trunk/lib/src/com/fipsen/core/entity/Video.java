package com.fipsen.core.entity;

public class Video extends AbstractEntity
{
	private String details;
	private String date;
	//private String time;
	private String videourl;
	private Image leadImage;
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
	/*public String getTime()
	{
		return time;
	}
	public void setTime(String time)
	{
		this.time = time;
	}*/
	public String getVideourl()
	{
		return videourl;
	}
	public void setVideourl(String videourl)
	{
		this.videourl = videourl;
	}
	public Image getLeadImage()
	{
		return leadImage;
	}
	public void setLeadImage(Image leadImage)
	{
		this.leadImage = leadImage;
	}
	
	

}
