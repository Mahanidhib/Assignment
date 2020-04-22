package com.capgemini.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table(name="Geo")
public class Geo implements Serializable {

	@Id
	@Column(name="geoId")
	private long geoId;
	
	@Column(name="geoTypeId")
	private int geoTypeId;
	
	@Column(name="geoName")
	private String geoName;
	
	@Column(name="geoCode")
	private int geoCode;
	
	@Column(name="geoSecCode")
	private int geoSecCode;
	
	@Column(name="abbrevation")
	private String abbrevation;
	
	
	
	@ManyToOne(targetEntity = MainGeoAssoc.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "geoid_fk", referencedColumnName = "geoID")
	private List<MainGeoAssoc> mga;

	@ManyToOne(targetEntity = AssocGeoAssoc.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "geoidto_fk", referencedColumnName = "geoIdTo")
	private List<AssocGeoAssoc> aga;
	
	public Geo(int geoId, int geoTypeId, String geoName, int geoCode,
			int geoSecCode, String abbrevation, List<AssocGeoAssoc> aga,
			List<MainGeoAssoc> mga) {
		super();
		this.geoId = geoId;
		this.geoTypeId = geoTypeId;
		this.geoName = geoName;
		this.geoCode = geoCode;
		this.geoSecCode = geoSecCode;
		this.abbrevation = abbrevation;
		this.aga = aga;
		this.mga = mga;
	}

	public Geo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public long getGeoId() {
		return geoId;
	}
	public void setGeoId(long geoId) {
		this.geoId = geoId;
	}
	public int getGeoTypeId() {
		return geoTypeId;
	}
	public void setGeoTypeId(int geoTypeId) {
		this.geoTypeId = geoTypeId;
	}
	public String getGeoName() {
		return geoName;
	}
	public void setGeoName(String geoName) {
		this.geoName = geoName;
	}
	public int getGeoCode() {
		return geoCode;
	}
	public void setGeoCode(int geoCode) {
		this.geoCode = geoCode;
	}
	public int getGeoSecCode() {
		return geoSecCode;
	}
	public void setGeoSecCode(int geoSecCode) {
		this.geoSecCode = geoSecCode;
	}
	public String getAbbrevation() {
		return abbrevation;
	}
	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	public List<MainGeoAssoc> getMga() {
		return mga;
	}

	public void setMga(List<MainGeoAssoc> mga) {
		this.mga = mga;
	}

	public List<AssocGeoAssoc> getAga() {
		return aga;
	}

	public void setAga(List<AssocGeoAssoc> aga) {
		this.aga = aga;
	}
	
	@Override
	public String toString() {
		return "Geo [geoId=" + geoId + ", geoTypeId=" + geoTypeId + ", geoName=" + geoName
				+ ", geoCode=" + geoCode + ", geoSecCode=" + geoSecCode
				+ ", abbrevation=" + abbrevation + ", roundingMode=" + "]";
	}
	
}



