package com.fipsen.core.dao;

import java.io.Serializable;
import java.util.List;

public interface IDAO
{
	public void save(Object o) throws Exception;
	
	public void delete(Object object) throws Exception;
	
	public Object getObject(Class clazz, Serializable id) throws Exception;
	
	public List getObjects(Class clazz) throws Exception;
	
	public List getObjectsByCriteria(Class clazz, String property, String value)
			throws Exception;
	
	public List getListFromHQL(String sql) throws Exception;
	
	public List getObjectsByOrder(Class clazz, String orderProperty, boolean asc) throws Exception;
}
