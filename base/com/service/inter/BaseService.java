package com.service.inter;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;
/**
 * 公共的服务接口
 * @author linpeng123l
 *
 * @param <T>
 */
public interface BaseService<T> {
	public void save(T t)throws Exception;
	public void save(List<T> t)throws Exception;
	public void update(T t)throws Exception;
	public void delete(T t)throws Exception;
	public T get(Serializable id) throws Exception;
	public List<Object[]> findBySql(String sql,final Object...objects) throws Exception;
	public List<T> findAll() throws Exception;
	public List<T> findByExample(T t) throws Exception;
	public List<T> findByCriteria(Criterion criterion)throws Exception;
	public List<T> findbyHQLSingleTable(String hql,final Object...objects)throws Exception ;
	public List<T> findByProperty(String name,Serializable value)throws Exception;
	
}
