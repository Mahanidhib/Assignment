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







/*package com.example.test.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DCTU")

public class DatedConversionToUom implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uomTypeId;
	
	private String abbrevation;

	public DatedConversionToUom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DatedConversionToUom(int uomTypeId, String abbrevation) {
		super();
		this.uomTypeId = uomTypeId;
		this.abbrevation = abbrevation;
	}

	public int getUomTypeId() {
		return uomTypeId;
	}

	public void setUomTypeId(int uomTypeId) {
		this.uomTypeId = uomTypeId;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	@Override
	public String toString() {
		return "DatedConversionToUom [uomTypeId=" + uomTypeId + ", abbrevation=" + abbrevation + "]";
	}
	*/
	

