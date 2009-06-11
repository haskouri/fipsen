package com.fipsen.web.actionsupport;

import java.util.List;

import org.apache.log4j.Logger;

import com.fipsen.core.dao.LatestNewsDAO;
import com.fipsen.core.entity.LatestNews;

public class DetailsNewsActionSupport extends BaseActionSupport
{
	private String url;
	private LatestNewsDAO latestNewsDAO;
	private LatestNews news;
	
	private Logger log = Logger.getLogger(this.getClass());
	public String getUrl()
	{
		return url;
	}


	public void setUrl(String url)
	{
		this.url = url;
	}


	public LatestNewsDAO getLatestNewsDAO()
	{
		return latestNewsDAO;
	}


	public void setLatestNewsDAO(LatestNewsDAO latestNewsDAO)
	{
		this.latestNewsDAO = latestNewsDAO;
	}


	public LatestNews getNews()
	{
		return news;
	}


	public void setNews(LatestNews news)
	{
		this.news = news;
	}


	public String execute() throws Exception
	{
		List<LatestNews> latestNewsDetailsList = (List<LatestNews>) latestNewsDAO.getObjectsByCriteria(LatestNews.class, "newsurl", url);
		if(latestNewsDetailsList == null)
		{
			log.error("No News with the url : " + url);
			return ERROR;
		}
		if(latestNewsDetailsList.size() >= 1)
		{
			news = latestNewsDetailsList.get(0);
		}
		return SUCCESS;
	}
}
