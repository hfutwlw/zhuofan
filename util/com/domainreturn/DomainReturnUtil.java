package com.domainreturn;

import java.util.ArrayList;
import java.util.List;

/**
 * 转换EXTJS所需模型
 * @author linpeng123l
 *
 * @param <T>
 */
public class DomainReturnUtil<T> {

	public List<DomainReturn<T>> domain(List<T> domains){
		List<DomainReturn<T>> domainReturns = new ArrayList<DomainReturn<T>>();
		if(domains!=null){
			for(T t : domains){
				domainReturns.add(new DomainReturn<T>(t));
			}
			return domainReturns;
		}else{
			return null;
		}
	}
	
}
