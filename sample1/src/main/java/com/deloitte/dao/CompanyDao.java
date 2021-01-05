package com.deloitte.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import com.deloitte.VO.CompanyDetails;


@Repository
public class CompanyDao {
	private static List<CompanyDetails> details = new ArrayList<CompanyDetails>();
	
	static {
		
		CompanyDetails details1 = new CompanyDetails(1, "Deloitte Consulting", "DE");
		CompanyDetails details2 = new CompanyDetails(2, "Deloitte Auditing", "DEA");
		CompanyDetails details3 = new CompanyDetails(3, "Deloitte Time and Expense", "DTE");
		details.add(details1);
		details.add(details2);
		details.add(details3);
	}
	
	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration().configure();		
		SessionFactory ss = config.buildSessionFactory();
		return ss;
	}
	public List<CompanyDetails> getCompanies(){
		
		Session ss = getSessionFactory().openSession();		
		List<CompanyDetails> dt = ss.createQuery("FROM Company").list();				
		ss.close();
		return dt;
	}
	
	public int addCompany(CompanyDetails company) {
		int size = details.size();
		company.setId(size+1);
		details.add(company);
		return company.getId();
	}
	
}
