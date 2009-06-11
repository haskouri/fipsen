package com.fipsen.core.data;

import java.util.List;

public class VideoData extends AbstractData
{
	private String details;
	//private String date;
	private ImageData leadImage;
	//private List<ImageData> images;
	//private String body;
	private String url;
	private String videoDate;
	private String collectionDate;
	private int position;
	//private String filePath;
	
	
	public String getDetails()
	{
		return details;
	}
	public String getUrl()
	{
		return url;
	}
	public void setUrl(String url)
	{
		this.url = url;
	}
	public void setDetails(String details)
	{
		this.details = details;
	}
	public ImageData getLeadImage()
	{
		return leadImage;
	}
	public void setLeadImage(ImageData leadImage)
	{
		this.leadImage = leadImage;
	}
	public String getVideoDate()
	{
		return videoDate;
	}
	public void setVideoDate(String videoDate)
	{
		this.videoDate = videoDate;
	}
	public String getCollectionDate()
	{
		return collectionDate;
	}
	public void setCollectionDate(String collectionDate)
	{
		this.collectionDate = collectionDate;
	}
	public int getPosition()
	{
		return position;
	}
	public void setPosition(int position)
	{
		this.position = position;
	}
	
	

}
