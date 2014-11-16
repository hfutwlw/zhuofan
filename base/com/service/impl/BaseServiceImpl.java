package com.service.impl;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.Criterion;
import com.dao.BaseDao;
import com.service.inter.BaseService;
/**
 * 
 * @author kevin
 *
 * @param <T>
 */
public class BaseServiceImpl<T extends Serializable> implements BaseService<T> {
	
	protected BaseDao<T> baseDao;
	/*
	 * public void save(T t) throws Exception;
	public void update(T t) throws Exception;
	public void delete(T t) throws Exception;
	public T get(Serializable id) throws Exception;
	public List<T> findAll() throws Exception;
	public List<T> findByExample(T t) throws Exception;
	public List<T> findbyHQLsingleTable(String hql,final Object...objects) throws Exception;
	public List<T> findByProperty(Serializable value,String name) throws Exception;
	public PageInfo<T> findPageInfo(int page) throws Exception;
	public PageInfo<T> findPageInfo(PageInfo<T> pageInfo) throws Exception;
	public PageInfo<T> findPageInfo(int page,int pagesize,String orderBy,String order) throws Exception;*/

	@Override
	public void save(T t) throws Exception {
		// TODO Auto-generated method stub
		baseDao.save(t);
	}

	@Override
	public void save(List<T> t) throws Exception {
		// TODO Auto-generated method stub
		baseDao.save(t);
	}

	@Override
	public void update(T t) throws Exception {
		// TODO Auto-generated method stub
		baseDao.update(t);
	}

	@Override
	public void delete(T t) throws Exception {
		// TODO Auto-generated method stub
		baseDao.delete(t);
	}

	@Override
	public T get(Serializable id) throws Exception {
		// TODO Auto-generated method stub
		
		return baseDao.get(id);
	}

	@Override
	public List<Object[]> findBySql(String sql, Object... objects)
			throws Exception {
		// TODO Auto-generated method stub
		return baseDao.findBySql(sql, objects);
	}

	@Override
	public List<T> findAll() throws Exception {
		// TODO Auto-generated method stub
		return baseDao.findAll();
	}

	@Override
	public List<T> findByExample(T t) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.findByExample(t);
	}

	@Override
	public List<T> findByCriteria(Criterion criterion) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.findByCriteria(criterion);
	}

	@Override
	public List<T> findbyHQLSingleTable(String hql, Object... objects)
			throws Exception {
		// TODO Auto-generated method stub
		return baseDao.findbyHQLSingleTable(hql, objects);
	}

	@Override
	public List<T> findByProperty(String name, Serializable value)
			throws Exception {
		// TODO Auto-generated method stub
		return baseDao.findByProperty(name, value);
	}
	
	
	
	
}
