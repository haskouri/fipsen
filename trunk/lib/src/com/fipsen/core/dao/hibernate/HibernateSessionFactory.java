package com.fipsen.core.dao.hibernate;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory
{
	//private static Log log = LogFactory.getLog(HibernateSessionFactory.class);
	static Logger log = Logger.getLogger(HibernateSessionFactory.class);
	private static final SessionFactory sessionFactory;
	
	static
	{
		try
		{
			/*
			 * Create the SessionFactory
			 */
			sessionFactory = new Configuration().configure().buildSessionFactory();
			//sessionFactory = new Configuration().buildSessionFactory();
		}
		catch (Throwable ex)
		{
			log.error("Initial SessionFactory creation failed.", ex);
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static final ThreadLocal session = new ThreadLocal();
	
	/**
	 * @return Session Object If object already exists then returns it, if not then creates a new
	 *         Session and returns it.
	 */
	public static Session currentSession()
	{
		Session s = (Session) session.get();
		/*
		 * Open a new Session, if this Thread has none yet
		 */
		if (s == null || !s.isOpen())
		{
			s = sessionFactory.openSession();
			session.set(s);
		}
		return s;
	}
	
	/**
	 * Closes the session if opened
	 */
	public static void closeSession()
	{
		Session s = (Session) session.get();
		if (s != null)
		{
			try
			{
				s.close();
			}
			catch (HibernateException e)
			{
				log.error(e);
			}
			/*catch (SQLException e)
			{
				log.error(e);
			}*/
		}
		session.set(null);
	}
}
