package com.capgemini.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="MGA")
public class MainGeoAssoc implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int geoId;
	private int id;
	private String geoAssoc;
	
	public MainGeoAssoc(int geoId,int id,String geoAssoc) {
		super();
		this.geoId=geoId;
		this.id=id;
		this.geoAssoc=geoAssoc;
	}

	public int getGeoId() {
		return geoId;
	}

	public void setGeoId(int geoId) {
		this.geoId = geoId;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGeoAssoc() {
		return geoAssoc;
	}

	public void setGeoAssoc(String geoAssoc) {
		this.geoAssoc = geoAssoc;
	}

	@Override
	public String toString() {
		return "MainGeoAssoc [geoId=" + geoId + "id="+ id +"geoAssoc =" +"geoAssoc]";
	}
}







