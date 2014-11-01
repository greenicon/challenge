package com.greenicon.challenge.data.models;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;


/**
 * The persistent class for the challenge database table.
 * 
 */
@Entity
@NamedQuery(name="Challenge.findAll", query="SELECT c FROM Challenge c")
public class Challenge implements Serializable {
	private static final long serialVersionUID = 1L;

	private String category;

	@Column(name="COVER_IMAGEID")
	private String coverImageid;

	private Timestamp createdts;

	private String description;

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(name="LOCATION_ID")
	private String locationId;

	private String name;

	@Column(name="PROFILE_IMAGEID")
	private String profileImageid;

	private String tags;

	private String type;

	private Timestamp updatedts;

	@Column(name="USER_ID")
	private String userId;

	public Challenge() {
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCoverImageid() {
		return this.coverImageid;
	}

	public void setCoverImageid(String coverImageid) {
		this.coverImageid = coverImageid;
	}

	public Timestamp getCreatedts() {
		return this.createdts;
	}

	public void setCreatedts(Timestamp createdts) {
		this.createdts = createdts;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocationId() {
		return this.locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfileImageid() {
		return this.profileImageid;
	}

	public void setProfileImageid(String profileImageid) {
		this.profileImageid = profileImageid;
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getUpdatedts() {
		return this.updatedts;
	}

	public void setUpdatedts(Timestamp updatedts) {
		this.updatedts = updatedts;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}