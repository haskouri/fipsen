package com.fipsen.core.dao.hibernate;

import java.util.List;

import org.hibernate.HibernateException;

import com.fipsen.core.dao.LatestNewsDAO;
import com.fipsen.core.entity.EntityConstants;
import com.fipsen.core.entity.LatestNews;

public class LatestNewsDAOHibernate extends BaseDAOHibernate implements
		LatestNewsDAO
{
	public void save(Object o) throws Exception
	{
		List<LatestNews> latestNewsList = super.getObjectsByCriteria(LatestNews.class, "position" , EntityConstants.LATEST_NEWS_SIZE+""); 
		List<LatestNews> restNews = super.getObjects(LatestNews.class);
		LatestNews oldestNews = null;
		if(latestNewsList.size() != 0)
		{
			oldestNews = (LatestNews) latestNewsList.get(0);
		}
		session = HibernateSessionFactory.currentSession();

		transaction = session.beginTransaction();

		try
		{
			
			if(oldestNews != null)
			{
				for (LatestNews latestNews : restNews)
				{
					if(latestNews.getOid().equals(oldestNews.getOid()))
					{
						restNews.remove(latestNews);
						break;
					}
				}
				session.delete(oldestNews);
			}
			
			for (LatestNews latestNews : restNews)
			{
				latestNews.setPosition(latestNews.getPosition()+1);
				session.saveOrUpdate(latestNews);
			}
			session.saveOrUpdate(o);

			transaction.commit();
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			transaction.rollback();
			throw e;
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}

	}

}
