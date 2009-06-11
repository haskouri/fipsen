package com.fipsen.core.entity;

public class LatestNews extends News
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

	public LatestNews()
	{

	}

	public LatestNews(News news)
	{
		super();
		this.setDate(news.getDate());
		this.setDetails(news.getDetails());
		this.setHeading(news.getHeading());
		this.setLeadImage(news.getLeadImage());
		this.setNewsurl(news.getNewsurl());
		this.setOid(news.getOid());
		this.setTime(news.getTime());
		this.setPosition(1);
	}

}
