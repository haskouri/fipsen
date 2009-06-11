package com.fipsen.web.actionsupport;

import java.util.List;

import com.fipsen.core.dao.LatestNewsDAO;
import com.fipsen.core.dao.LatestVideoDAO;
import com.fipsen.core.dao.TopCelebrityDAO;
import com.fipsen.core.entity.LatestNews;
import com.fipsen.core.entity.LatestVideo;
import com.fipsen.core.entity.TopCelebrity;

public class NewsActionSupport extends BaseActionSupport
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2170622549131888477L;
	private List <LatestNews> newsList;
	private List <LatestVideo> videoList;
	private List <TopCelebrity> topCelebrityList;
	private LatestNewsDAO latestNewsDAO;
	private LatestVideoDAO latestVideoDAO;
	private TopCelebrityDAO topCelebrityDAO;
	private Advertisement advertisement;
	
	
	
	public Advertisement getAdvertisement()
	{
		return advertisement;
	}


	public void setAdvertisement(Advertisement advertisement)
	{
		this.advertisement = advertisement;
	}


	public List<TopCelebrity> getTopCelebrityList()
	{
		return topCelebrityList;
	}


	public void setTopCelebrityList(List<TopCelebrity> topCelebrityList)
	{
		this.topCelebrityList = topCelebrityList;
	}


	public TopCelebrityDAO getTopCelebrityDAO()
	{
		return topCelebrityDAO;
	}


	public void setTopCelebrityDAO(TopCelebrityDAO topCelebrityDAO)
	{
		this.topCelebrityDAO = topCelebrityDAO;
	}


	public List<LatestVideo> getVideoList()
	{
		return videoList;
	}


	public void setVideoList(List<LatestVideo> videoList)
	{
		this.videoList = videoList;
	}


	public LatestVideoDAO getLatestVideoDAO()
	{
		return latestVideoDAO;
	}


	public void setLatestVideoDAO(LatestVideoDAO latestVideoDAO)
	{
		this.latestVideoDAO = latestVideoDAO;
	}


	public LatestNewsDAO getLatestNewsDAO()
	{
		return latestNewsDAO;
	}


	public void setLatestNewsDAO(LatestNewsDAO latestNewsDAO)
	{
		this.latestNewsDAO = latestNewsDAO;
	}


	public List<LatestNews> getNewsList()
	{
		return newsList;
	}


	public void setNewsList(List<LatestNews> newsList)
	{
		this.newsList = newsList;
	}


	public String execute() throws Exception
	{
		//NewsDAO newsDAO = new NewsDAOHibernate();
		
		List<LatestNews> objects = (List<LatestNews>) latestNewsDAO.getObjectsByOrder(LatestNews.class,"position",true);
		newsList = objects; 
		
		List<LatestVideo> videos = (List<LatestVideo>) latestVideoDAO.getObjectsByOrder(LatestVideo.class, "position", true);
		videoList = videos;
		
		List<TopCelebrity> celebrities = (List<TopCelebrity>) topCelebrityDAO.getObjectsByOrder(TopCelebrity.class, "position", true);
		this.topCelebrityList = celebrities.subList(0, 10);
		
		//Advertisement adv = new Advertisement();
		advertisement.prepareAdvertisements();
		
		return SUCCESS;
	}
}