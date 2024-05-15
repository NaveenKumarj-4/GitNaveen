package com.java.hib;

public class Employee {
	private int empcode;
	private String efname;
	private String elname;
	private String state;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empcode, String efname, String elname, String state, double salary) {
		super();
		this.empcode = empcode;
		this.efname = efname;
		this.elname = elname;
		this.state = state;
		this.salary = salary;
	}
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEfname() {
		return efname;
	}
	public void setEfname(String efname) {
		this.efname = efname;
	}
	public String getElname() {
		return elname;
	}
	public void setElname(String elname) {
		this.elname = elname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", efname=" + efname + ", elname=" + elname + ", state=" + state
				+ ", salary=" + salary + "]";
	}
	
	

}
