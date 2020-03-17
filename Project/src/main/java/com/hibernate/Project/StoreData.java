package com.hibernate.Project;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

public class StoreData {

	public static void main(String[] args)
{
		/*StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=meta.getSessionFactoryBuilder().build();*/
		
		SessionFactory fac = new Configuration().configure("hibernate.xml").buildSessionFactory();
		
		Session s=fac.openSession();
		Transaction t=s.beginTransaction();
		//Employee e=new Employee();
		String hql = "SELECT E.firstname from Employee E where E.id>2";
		Query query = s.createQuery(hql);
		List<String> items = query.list();
		for(String si:items) {
			System.out.println(s);
		}
		/*t.commit();
		System.out.println("data inserted successfully");
		fac.close();
		s.close();*/

}

}
