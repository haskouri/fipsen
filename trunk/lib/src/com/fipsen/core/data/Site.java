package com.fipsen.core.data;

import java.util.List;

public class Site extends AbstractData 
{
	private String siteUrl;
	private List<NewsData> news;

	
	public String getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public List<NewsData> getNews() {
		return news;
	}

	public void setNews(List<NewsData> news) {
		this.news = news;
	}
	
	
}
