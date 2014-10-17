package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the gang database table.
 * 
 */
@Entity
@Table(name="gang")
@NamedQuery(name="Gang.findAll", query="SELECT g FROM Gang g")
public class Gang implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(name="COVER_IMAGEID", nullable=false, length=64)
	private String coverImageid;

	@Column(nullable=false)
	private Timestamp createdts;

	@Column(nullable=false, length=256)
	private String description;

	@Column(name="LOCATION_ID", nullable=false, length=64)
	private String locationId;

	@Column(nullable=false, length=128)
	private String name;

	@Column(name="PROFILE_IMAGEID", nullable=false, length=64)
	private String profileImageid;

	@Column(nullable=false, length=64)
	private String theme;

	@Column(nullable=false)
	private Timestamp updatedts;

	//bi-directional many-to-one association to GangUserMap
	@OneToMany(mappedBy="gang", fetch=FetchType.EAGER)
	private List<GangUserMap> gangUserMaps;

	public Gang() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Timestamp getUpdatedts() {
		return this.updatedts;
	}

	public void setUpdatedts(Timestamp updatedts) {
		this.updatedts = updatedts;
	}

	public List<GangUserMap> getGangUserMaps() {
		return this.gangUserMaps;
	}

	public void setGangUserMaps(List<GangUserMap> gangUserMaps) {
		this.gangUserMaps = gangUserMaps;
	}

	public GangUserMap addGangUserMap(GangUserMap gangUserMap) {
		getGangUserMaps().add(gangUserMap);
		gangUserMap.setGang(this);

		return gangUserMap;
	}

	public GangUserMap removeGangUserMap(GangUserMap gangUserMap) {
		getGangUserMaps().remove(gangUserMap);
		gangUserMap.setGang(null);

		return gangUserMap;
	}

}