package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class EmployeeDaoImpl implements EmployeeDAO{
	
	SessionFactory sf;
	Session session;


	@Override
	public List<Employee> show() {
		  sf=SessionHelper.getConnection();
		  session=sf.openSession();
		 Criteria cr=session.createCriteria(Employee.class);
		 List<Employee> emp=cr.list();
		  return emp;
	}
		  
		  
}

		
		