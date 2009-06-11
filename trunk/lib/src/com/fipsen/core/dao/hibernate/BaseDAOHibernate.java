package com.fipsen.core.dao.hibernate;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.fipsen.core.dao.IDAO;


public class BaseDAOHibernate implements IDAO
{
	/**
	 * Logger for this class
	 */
	Logger log = Logger.getLogger(this.getClass());
	
	protected Session session;
	protected Transaction transaction;
	
	/**
	 * @return the session
	 */
	public Session getSession()
	{
		return session;
	}
	
	/**
	 * @param session
	 *            the session to set
	 */
	public void setSession(Session session)
	{
		this.session = session;
	}
	
	/**
	 * @return the transaction
	 */
	public Transaction getTransaction()
	{
		return transaction;
	}
	
	/**
	 * @param transaction
	 *            the transaction to set
	 */
	public void setTransaction(Transaction transaction)
	{
		this.transaction = transaction;
	}
	
	/**
	 * Generic method to save an object - handles both update and insert.
	 * 
	 * @param o
	 *            the object to save
	 */
	public void save(Object o) throws Exception
	{
		session = HibernateSessionFactory.currentSession();
		
		transaction = session.beginTransaction();
		
		try
		{
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
	
	/**
	 * Generic method to get an object based on class and identifier. A Runtime Exception is thrown
	 * if nothing is found.
	 * 
	 * @param clazz
	 *            model class to lookup
	 * @param id
	 *            the identifier (primary key) of the class
	 * @return a populated object
	 */
	
	public Object getObject(Class clazz, Serializable id) throws Exception
	{
		session = HibernateSessionFactory.currentSession();
		
		Object o = session.get(clazz, id);
		
		if (o == null)
		{
			throw new Exception("Failed to load object");
		}
		
		HibernateSessionFactory.closeSession();
		
		return o;
	}
	
	/**
	 * Generic method used to get all objects of a particular type. This is the same as lookup up
	 * all rows in a table.
	 * 
	 * @param clazz
	 *            the type of objects (a.k.a. while table) to get data from
	 * @return List of populated objects
	 */
	public List getObjects(Class clazz) throws Exception
	{
		session = HibernateSessionFactory.currentSession();
		
		try
		{
			return session.createCriteria(clazz).list();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
	}
	
	/**
	 * Generic method to get list of objects based on class, property and the value of the property.
	 * A Runtime Exception is thrown if nothing is found.
	 * 
	 * @param clazz
	 *            model class to lookup
	 * @param property
	 *            the property of the class with which to look up
	 * @param value
	 *            the value of the property with which to look up
	 * @return a populated object
	 */
	public List getObjectsByCriteria(Class clazz, String property, String value)
			throws Exception
	{
		session = HibernateSessionFactory.currentSession();
		
		try
		{
			
			List list = session.createQuery("from " + clazz.getName() + " where " + property + " like '" + value + "%'").list();
			return list;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
	}
	
	/**
	 * Generic method to get list of objects based on a given HQL Query. A Runtime Exception is
	 * thrown if nothing is found.
	 * 
	 * @param hql
	 *            The Hibernate Query Language to retrieve Objects
	 * @return a populated list of objects
	 */
	public List getListFromHQL(String sql) throws Exception
	{
		List list = null;
		
		try
		{
			session = HibernateSessionFactory.currentSession();
			
			Query query = session.createQuery(sql);
			
			list = query.list();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		
		return list;
	}
	
	/**
	 * Generic method to delete an object based on class and id
	 * 
	 * @param clazz
	 *            model class to lookup
	 * @param id
	 *            the identifier (primary key) of the class
	 */
	public void delete(Class clazz, Serializable id) throws Exception
	{
		Object o = getObject(clazz, id);
		session = HibernateSessionFactory.currentSession();
		
		transaction = session.beginTransaction();
		
		try
		{
			session.delete(o);
			
			transaction.commit();
		}
		catch (Exception e)
		{
			transaction.rollback();
			e.printStackTrace();
			log.debug(e.getMessage());
			throw e;
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
	}
	
	/**
	 * Deletes a specific row from a table.
	 * 
	 * @param dbObject
	 *            The entity bean of the desired table
	 * @exception Exception
	 *                if business logic throws an exception
	 */
	public void delete(Object dbObject) throws Exception
	{
		session = HibernateSessionFactory.currentSession();
		
		transaction = session.beginTransaction();
		
		try
		{
			session.delete(dbObject);
			
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
	
	public List getObjectsByOrder(Class clazz, String orderProperty, boolean isAscending) throws Exception
	{
		session = HibernateSessionFactory.currentSession();
		
		try
		{
			String asc = "asc";
			if (!isAscending)
			{
				asc = "desc";
			}
			 
			List list = session.createQuery("from " + clazz.getName() + " order by " + orderProperty + " " + asc).list();
			//Query q = session.createFilter(list, "order by " + orderProperty);
			return list;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
	}
	
}
