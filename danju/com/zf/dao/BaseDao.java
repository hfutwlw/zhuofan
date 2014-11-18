package com.zf.dao;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.Id;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.database.util.PageInfo;


@Component
public class BaseDao<T extends Serializable>{
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	@SuppressWarnings("rawtypes")
	private Class entityClass;
	private String pkname="id";
	private final String HQL_LIST_ALL;
	private final String HQL_COUNT_ALL;
	@SuppressWarnings("rawtypes")
	public Class getEntityClass() {
		return entityClass;
	}
	@SuppressWarnings("rawtypes")
	public void setEntityClass(Class entityClass) {
		this.entityClass = entityClass;
	}

	public Session getSession(){		
		session = sessionFactory.getCurrentSession();		
		return session;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@SuppressWarnings("rawtypes")
	public BaseDao() {
			
		Type type = this.getClass().getGenericSuperclass();
		if (type.toString().indexOf("BaseDao") != -1) {
			ParameterizedType type1 = (ParameterizedType) type;
			Type[] types = type1.getActualTypeArguments();
			setEntityClass((Class) types[0]);
		}else{
			type = ((Class)type).getGenericSuperclass();
			ParameterizedType type1 = (ParameterizedType) type;
			Type[] types = type1.getActualTypeArguments();
			setEntityClass((Class) types[0]);
		}
		getPkname();
		HQL_LIST_ALL="from "+this.entityClass.getSimpleName()+" order by "+pkname+" desc";
		HQL_COUNT_ALL="select count(*) from "+this.entityClass.getSimpleName();
	}
	/**
	 * 
	 * @return
	 */
	public String getPkname() {
		Field[] fields = this.entityClass.getDeclaredFields();	
		for (Field field : fields) {
			
			if(field.isAnnotationPresent(Id.class)){
			this.pkname=field.getName();
			System.out.println(this.pkname);
			break;
			}
		}
		return pkname;
	}
	/**
	 * 
	 * 
	 * @param t
	 * @throws HibernateException
	 */
	public void save(T t) throws HibernateException{
			 		

			
			this.getSession().save(t);
		
	}
	public void save(List<T> t) throws Exception {
		
		for(int i = 0; i < t.size(); i++){
			this.getSession().save(t.get(i));
		}		

		
	}
	/**
	 *  
	 * @param t
	 * @throws HibernateException
	 */
	public void update(T t) throws HibernateException{
			 		
			

			this.getSession().update(t);
	}

	/**
	 * 
	 * 
	 * @param t
	 * @throws HibernateException
	 */
	public void delete(T t) throws HibernateException{
			 		
			

			this.getSession().delete(t);			

	}
	/**
	 * 
	 * 
	 * @param id
	 * @throws HibernateException
	 */
	@SuppressWarnings("unchecked")
	public T get(Serializable id) throws Exception{
			 
			T t=null;		
			

			t=(T) this.getSession().get(this.getEntityClass(), id);

		return t;
	}
	/**
	 * 
	 * 
	 * @throws HibernateException
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll() throws Exception {
		List<T> list=null;
		 
		

			Query query = this.getSession().createQuery(HQL_LIST_ALL);
			list = query.list();

		
		return list;
	}
	/**
	 * 
	 * 
	 * @throws HibernateException
	 */
	public int findAllCount() throws Exception {
		 
		int count=0;
		
			

			Query query = this.getSession().createQuery(HQL_COUNT_ALL);
			count = ((Long)query.uniqueResult()).intValue();

		return count;
	}
	/**
	 * 
	 * 
	 * @param criteria
	 * @throws HibernateException
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByCriteria(Criterion criterion) throws Exception {
		List<T> list=null;
		 
		
			
		
			Criteria criteria1 = this.getSession().createCriteria(getEntityClass());
			criteria1.add(criterion);			
			list = criteria1.list();

		return list;
	}

	/**
	 * 
	 * 
	 * @param t
	 * @throws HibernateException
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByExample(T t) throws Exception {
		List<T> list=null;
		 
		Example example = Example.create(t);
		
			

			Criteria criteria = this.getSession().createCriteria(getEntityClass());
			criteria.add(example);
			list = criteria.list();
			

		return list;
	}
	/**
	 * 
	 * 
	 * @param hql
	 * @param objects
	 * @throws HibernateException
	 */
	@SuppressWarnings("unchecked")
	public List<Object[]> findByHql(String hql,final Object...objects) throws Exception{
		List<Object[]> list=null;
		 
		
			

			Query query = this.getSession().createQuery(hql);
			for (int i = 0; i < objects.length; i++) {
				query.setParameter(i, objects[i]);
			}
			list = query.list();

		return list;
	}

	/**
	 * HQL single table 
	 * 
	 * @param hql
	 * @param objects
	 * @throws HibernateException
	 */
	@SuppressWarnings("unchecked")

	public List<T> findbyHQLSingleTable(String hql,final Object...objects) throws Exception{
		List<T> list=null;
		 
		

			Query query = this.getSession().createQuery(hql);
			for (int i = 0; i < objects.length; i++) {
				query.setParameter(i, objects[i]);
			}
			list = query.list();
	
		return list;
	}
	/**
	 * SQL
	 * 
	 * @param sql
	 * @param objects
	 * @throws HibernateException
	 */
	@SuppressWarnings("unchecked")
	public List<Object[]> findBySql(String sql,final Object...objects)throws Exception{
			List<Object[]> list=null;
	
			Query query = this.getSession().createSQLQuery(sql);
			for (int i = 0; i < objects.length; i++) {
				query.setParameter(i, objects[i]);
			}
			list = query.list();

		
		return list;
	}
	/**
	 * SQL single table 
	 * 
	 * @param sql
	 * @param objects
	 * @throws HibernateException
	 */
	@SuppressWarnings("unchecked")
	public List<T> findBySqlSingleTable(String sql,final Object...objects){
			List<T> list=null;
	
			Query query = this.getSession().createSQLQuery(sql);
			for (int i = 0; i < objects.length; i++) {
				query.setParameter(i, objects[i]);
			}
			list = query.list();
	
		return list;
	}
	/**
	 * 
	 * @param page
	 * @param pagesize
	 * @param orderBy
	 * @param order
	 * @return
	 */
	@SuppressWarnings({ "unchecked" })
	public PageInfo<T> findPageInfo(int page,int pagesize,String orderBy,String order) throws Exception{
		PageInfo<T> pageInfo = null;
		String hql = "from " + entityClass.getSimpleName();
		if(pageInfo==null)
		pageInfo = new PageInfo<T>();
		
		if(null != order && !"".equals(order))
			pageInfo.setOrder(order);
		if(null != orderBy && !"".equals(orderBy))
			pageInfo.setOrderBy(orderBy);
		if(page != 0){
			pageInfo.setPage(page);
		} else return null;
		
		if(pagesize != 0){
			pageInfo.setPagesize(pagesize);
		}
			hql +=" order by "+pageInfo.getOrderBy()+" "+pageInfo.getOrder();			
	
			Query query = this.getSession().createQuery(hql).setFirstResult(pageInfo.getStart()).setMaxResults(pageInfo.getPagesize());
			List<T> list = query.list();
	
			pageInfo.setResult(list);
			pageInfo.setCount(this.findAllCount());
			
		return pageInfo;
	}
	
	/**
	 *@param page
	 * @return
	 */
	public PageInfo<T> findPageInfo(PageInfo<T> pageInfo) throws Exception{
		
		if (pageInfo==null)return null;			
		String hql = "from "+entityClass.getSimpleName();
		if(!"".equals(pageInfo.getOrderBy())){
			hql = hql+" order by "+pageInfo.getOrderBy()+"  "+pageInfo.getOrder();
		}
	
			Query query = this.getSession().createQuery(hql).setFirstResult((pageInfo.getPage()-1)*pageInfo.getPagesize()).setMaxResults(pageInfo.getPagesize());
			@SuppressWarnings("unchecked")
			List<T> list = query.list();
	
			pageInfo.setResult(list);
			int count = this.findAllCount();
			pageInfo.setCount(count);
			
		
		return pageInfo;
	}
	public PageInfo<T> findPageInfo(int page) throws Exception{
		return this.findPageInfo(page, 10, null, null);
	}	
	

	public List<T> findByProperty(String name,Serializable value)
			throws Exception {
		String hql = "from "+ entityClass.getSimpleName()+" where "+ name +" = " + value;
	
		Query query = this.getSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<T> list = query.list();
	
		return list;
	}
	
}
