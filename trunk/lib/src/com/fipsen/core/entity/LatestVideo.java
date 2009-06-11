package com.fipsen.core.entity;

public class LatestVideo extends Video
{
	private int position;

	public int getPosition()
	{
		return position;
	}

	public void setPosition(int position)
	{
		this.position = position;
	}
	
	public LatestVideo(){}
	
	public LatestVideo( Video video )
	{
		this.setOid(video.getOid());
		this.setDate(video.getDate());
		this.setDetails(video.getDetails());
		this.setLeadImage(video.getLeadImage());
		//this.setPosition(position)
		this.setVideourl(video.getVideourl());
		this.setPosition(1);
	}
	
	
}
