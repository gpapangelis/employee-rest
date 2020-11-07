package com.george.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empid")
	private int empid;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="job")
	private String job;
	
	@Column(name="mngid")
	private int mngid;
	
	@Column(name="hiredate")
	private String hiredate;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="comm")
	private int comm;
	
	@Column(name="deptid")
	private int deptid;
	
	
public Employee() {
		
	
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMngid() {
		return mngid;
	}

	public void setMngid(int mngid) {
		this.mngid = mngid;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", lastName=" + lastName + ", firstName=" + firstName + ", job=" + job
				+ ", mngid=" + mngid + ", hiredate=" + hiredate + ", salary=" + salary + ", comm=" + comm + ", deptid="
				+ deptid + "]";
	}

	
}
