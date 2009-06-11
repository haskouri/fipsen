package com.fipsen.core.dao.hibernate;

import java.util.List;

import com.fipsen.core.dao.LatestNewsDAO;
import com.fipsen.core.dao.NewsDAO;
import com.fipsen.core.data.ImageData;
import com.fipsen.core.data.NewsData;
import com.fipsen.core.entity.Image;
import com.fipsen.core.entity.LatestNews;
import com.fipsen.core.entity.News;
import com.fipsen.core.util.DataToEntityConverter;

public class TestDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestDAO t = new TestDAO();
		t.testOrder();
		
	}
	
	private void testOrder()
	{
		LatestNewsDAO latestNewsDAO = new LatestNewsDAOHibernate();
		try
		{
			List obj = latestNewsDAO.getObjectsByOrder(LatestNews.class, "position", true);
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void testSomething()
	{
		NewsDAO newsDAO = new NewsDAOHibernate();
		
		NewsData newsData = new NewsData();
		newsData.setBody("this is a test for saving data.");
		newsData.setCollectionDate("22, Dec");
		newsData.setFilePath("abdafjlaf");
		newsData.setHeadingText("this is heading.");
		newsData.setHeadingUrl("heading url");
		ImageData image = new ImageData();
		image.setAlt("this is alt");
		image.setFilePath("this is file path.");
		image.setTitle("this is title");
		image.setUrl("this is url");
		newsData.setLeadImage(image);
		
		try {
			News news = DataToEntityConverter.convertToNews(newsData);
			Image img = news.getLeadImage();
			newsDAO.save(img);
			newsDAO.save(news);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}
