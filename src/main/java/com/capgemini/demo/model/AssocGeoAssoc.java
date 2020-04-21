package com.capgemini.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Ass")
public class AssocGeoAssoc implements Serializable{

	@Id
	@Column(name="geoIdTo")
	private int geoIdTo;
	private int assocTypeId;
	private int id;
	
	public AssocGeoAssoc(int geoIdTo,int assocTypeId,int id) {
		super();
		this.geoIdTo=geoIdTo;
		this.assocTypeId=assocTypeId;
		this.id=id;
	}

	public int getGeoIdTo() {
		return geoIdTo;
	}

	public void setGeoIdTo(int geoIdTo) {
		this.geoIdTo = geoIdTo;
	}

	public int getAssocTypeId() {
		return assocTypeId;
	}

	public void setAssocTypeId(int assocTypeId) {
		this.assocTypeId = assocTypeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "AssocGeoAssoc [geoIdTo=" + geoIdTo + ", assocTypeId=" + assocTypeId + ",id="+"id]";
	}
}







/*
 * package com.example.test.model;
 * 
 * import java.io.Serializable;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.Table;
 * 
 * 
 * 
 * @Entity
 * 
 * @Table(name="DMUCD")
 * 
 * public class DatedMainUomConversionDated implements Serializable{
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private int mainId;
 * 
 * private String description;
 * 
 * public DatedMainUomConversionDated() { super(); }
 * 
 * public DatedMainUomConversionDated(int mainId, String description) { super();
 * this.mainId = mainId; this.description = description; }
 * 
 * public int getMainId() { return mainId; }
 * 
 * public void setMainId(int mainId) { this.mainId = mainId; }
 * 
 * public String getDescription() { return description; }
 * 
 * public void setDescription(String description) { this.description =
 * description; }
 * 
 * @Override public String toString() { return
 * "DatedMainUomConversionDated [mainId=" + mainId + ", description=" +
 * description + "]"; }
 * 
 * 
 * 
 * }
 */