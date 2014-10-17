package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the location database table.
 * 
 */
@Entity
@Table(name="location")
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(nullable=false, length=64)
	private String city;

	@Column(nullable=false, length=64)
	private String country;

	@Column(nullable=false, length=16)
	private String latitude;

	@Column(nullable=false, length=64)
	private String locality1;

	@Column(nullable=false, length=64)
	private String locality2;

	@Column(nullable=false, length=16)
	private String longitude;

	@Column(nullable=false, length=64)
	private String state;

	public Location() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLocality1() {
		return this.locality1;
	}

	public void setLocality1(String locality1) {
		this.locality1 = locality1;
	}

	public String getLocality2() {
		return this.locality2;
	}

	public void setLocality2(String locality2) {
		this.locality2 = locality2;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}