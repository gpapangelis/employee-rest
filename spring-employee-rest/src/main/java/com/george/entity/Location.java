package com.george.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locations")
public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="locid")
	private int locid;
	
	@Column(name="locname")
	private String locname;
	
			
	public Location() {
		
	
		
	}


	public int getLocid() {
		return locid;
	}


	public void setLocid(int locid) {
		this.locid = locid;
	}


	public String getLocname() {
		return locname;
	}


	public void setLocname(String locname) {
		this.locname = locname;
	}


	@Override
	public String toString() {
		return "Location [locid=" + locid + ", locname=" + locname + "]";
	}



	
	
}
