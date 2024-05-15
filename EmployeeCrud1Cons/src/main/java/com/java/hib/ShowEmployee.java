package com.java.hib;

import java.util.List;


public class ShowEmployee {
	public static void main(String[] args) {
		
		EmployeeDAO e=new EmployeeDaoImpl();
		
		List<Employee> employ=e.show();
		
		for (Employee bk : employ) {
			System.out.println(bk);
		}
		
		
	}

}
