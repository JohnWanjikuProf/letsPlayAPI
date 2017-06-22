package org.wanjiku.letsPlay.services;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.wanjiku.letsPlay.persistence.HibernateUtility;

public class UserAccountService {
	public UserAccountService(){
		
	}
	private  CriteriaQuery<UserAccountService> getCriteria (){
        CriteriaBuilder builder = HibernateUtility.getSession().getCriteriaBuilder();
        CriteriaQuery<UserAccountService> criteria = builder.createQuery(UserAccountService.class);
        return criteria;
	}
	public List<UserAccountService> getUsers(){
		 
		/* Root<UserAccount> userAccountRoot = getCriteriaQuery().from(UserAccount.class);
	     getCriteriaQuery().select(userAccountRoot);*/
	     
		 getCriteria().from(UserAccountService.class);
	     List<UserAccountService> userAccounts = HibernateUtility.getSession().createQuery(getCriteria()).getResultList();
	     HibernateUtility.getSession().close();
		return userAccounts;
	}
	

}
