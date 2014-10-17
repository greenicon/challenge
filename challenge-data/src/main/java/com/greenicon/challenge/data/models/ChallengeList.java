package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the challenge_list database table.
 * 
 */
@Entity
@Table(name="challenge_list")
@NamedQuery(name="ChallengeList.findAll", query="SELECT c FROM ChallengeList c")
public class ChallengeList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(name="COVER_MEDIAID", nullable=false, length=64)
	private String coverMediaid;

	@Column(nullable=false)
	private Timestamp createdts;

	@Column(nullable=false, length=256)
	private String description;

	@Column(name="LOCATION_ID", nullable=false, length=64)
	private String locationId;

	@Column(nullable=false)
	private Timestamp modifiedts;

	@Column(nullable=false, length=128)
	private String name;

	@Column(nullable=false, length=64)
	private String owner;

	@Column(name="PROFILE_MEDIAID", nullable=false, length=64)
	private String profileMediaid;

	@Column(nullable=false, length=64)
	private String type;

	@Column(name="USER_ID", nullable=false, length=64)
	private String userId;

	//bi-directional many-to-one association to ChallengeListProp
	@OneToMany(mappedBy="challengeList", fetch=FetchType.EAGER)
	private List<ChallengeListProp> challengeListProps;

	//bi-directional many-to-one association to ChallengeListUserGangMap
	@OneToMany(mappedBy="challengeList", fetch=FetchType.EAGER)
	private List<ChallengeListUserGangMap> challengeListUserGangMaps;

	public ChallengeList() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCoverMediaid() {
		return this.coverMediaid;
	}

	public void setCoverMediaid(String coverMediaid) {
		this.coverMediaid = coverMediaid;
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

	public Timestamp getModifiedts() {
		return this.modifiedts;
	}

	public void setModifiedts(Timestamp modifiedts) {
		this.modifiedts = modifiedts;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getProfileMediaid() {
		return this.profileMediaid;
	}

	public void setProfileMediaid(String profileMediaid) {
		this.profileMediaid = profileMediaid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<ChallengeListProp> getChallengeListProps() {
		return this.challengeListProps;
	}

	public void setChallengeListProps(List<ChallengeListProp> challengeListProps) {
		this.challengeListProps = challengeListProps;
	}

	public ChallengeListProp addChallengeListProp(ChallengeListProp challengeListProp) {
		getChallengeListProps().add(challengeListProp);
		challengeListProp.setChallengeList(this);

		return challengeListProp;
	}

	public ChallengeListProp removeChallengeListProp(ChallengeListProp challengeListProp) {
		getChallengeListProps().remove(challengeListProp);
		challengeListProp.setChallengeList(null);

		return challengeListProp;
	}

	public List<ChallengeListUserGangMap> getChallengeListUserGangMaps() {
		return this.challengeListUserGangMaps;
	}

	public void setChallengeListUserGangMaps(List<ChallengeListUserGangMap> challengeListUserGangMaps) {
		this.challengeListUserGangMaps = challengeListUserGangMaps;
	}

	public ChallengeListUserGangMap addChallengeListUserGangMap(ChallengeListUserGangMap challengeListUserGangMap) {
		getChallengeListUserGangMaps().add(challengeListUserGangMap);
		challengeListUserGangMap.setChallengeList(this);

		return challengeListUserGangMap;
	}

	public ChallengeListUserGangMap removeChallengeListUserGangMap(ChallengeListUserGangMap challengeListUserGangMap) {
		getChallengeListUserGangMaps().remove(challengeListUserGangMap);
		challengeListUserGangMap.setChallengeList(null);

		return challengeListUserGangMap;
	}

}