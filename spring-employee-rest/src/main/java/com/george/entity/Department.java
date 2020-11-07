package com.george.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="deptid")
	private int deptid;
	
	@Column(name="dname")
	private String dname;
	
	
	@Column(name="locid")
	private int locid;
	
		
	public Department() {
		
	
		
	}


	public int getDeptid() {
		return deptid;
	}


	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public int getLocid() {
		return locid;
	}


	public void setLocid(int locid) {
		this.locid = locid;
	}


	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + ", locid=" + locid + "]";
	}



	
	
}
