package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the challenge database table.
 * 
 */
@Entity
@Table(name="challenge")
@NamedQuery(name="Challenge.findAll", query="SELECT c FROM Challenge c")
public class Challenge implements Serializable {
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
	private String type;

	@Column(nullable=false)
	private Timestamp updatedts;

	@Column(name="USER_ID", nullable=false, length=64)
	private String userId;

	//bi-directional many-to-one association to ChallengeData
	@OneToMany(mappedBy="challenge", fetch=FetchType.EAGER)
	private List<ChallengeData> challengeData;

	//bi-directional many-to-one association to ChallengeGroupMap
	@OneToMany(mappedBy="challenge1", fetch=FetchType.EAGER)
	private List<ChallengeGroupMap> challengeGroupMaps1;

	//bi-directional many-to-one association to ChallengeGroupMap
	@OneToMany(mappedBy="challenge2", fetch=FetchType.EAGER)
	private List<ChallengeGroupMap> challengeGroupMaps2;

	//bi-directional many-to-one association to ChallengeUserGangMap
	@OneToMany(mappedBy="challenge", fetch=FetchType.EAGER)
	private List<ChallengeUserGangMap> challengeUserGangMaps;

	public Challenge() {
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

	public List<ChallengeData> getChallengeData() {
		return this.challengeData;
	}

	public void setChallengeData(List<ChallengeData> challengeData) {
		this.challengeData = challengeData;
	}

	public ChallengeData addChallengeData(ChallengeData challengeData) {
		getChallengeData().add(challengeData);
		challengeData.setChallenge(this);

		return challengeData;
	}

	public ChallengeData removeChallengeData(ChallengeData challengeData) {
		getChallengeData().remove(challengeData);
		challengeData.setChallenge(null);

		return challengeData;
	}

	public List<ChallengeGroupMap> getChallengeGroupMaps1() {
		return this.challengeGroupMaps1;
	}

	public void setChallengeGroupMaps1(List<ChallengeGroupMap> challengeGroupMaps1) {
		this.challengeGroupMaps1 = challengeGroupMaps1;
	}

	public ChallengeGroupMap addChallengeGroupMaps1(ChallengeGroupMap challengeGroupMaps1) {
		getChallengeGroupMaps1().add(challengeGroupMaps1);
		challengeGroupMaps1.setChallenge1(this);

		return challengeGroupMaps1;
	}

	public ChallengeGroupMap removeChallengeGroupMaps1(ChallengeGroupMap challengeGroupMaps1) {
		getChallengeGroupMaps1().remove(challengeGroupMaps1);
		challengeGroupMaps1.setChallenge1(null);

		return challengeGroupMaps1;
	}

	public List<ChallengeGroupMap> getChallengeGroupMaps2() {
		return this.challengeGroupMaps2;
	}

	public void setChallengeGroupMaps2(List<ChallengeGroupMap> challengeGroupMaps2) {
		this.challengeGroupMaps2 = challengeGroupMaps2;
	}

	public ChallengeGroupMap addChallengeGroupMaps2(ChallengeGroupMap challengeGroupMaps2) {
		getChallengeGroupMaps2().add(challengeGroupMaps2);
		challengeGroupMaps2.setChallenge2(this);

		return challengeGroupMaps2;
	}

	public ChallengeGroupMap removeChallengeGroupMaps2(ChallengeGroupMap challengeGroupMaps2) {
		getChallengeGroupMaps2().remove(challengeGroupMaps2);
		challengeGroupMaps2.setChallenge2(null);

		return challengeGroupMaps2;
	}

	public List<ChallengeUserGangMap> getChallengeUserGangMaps() {
		return this.challengeUserGangMaps;
	}

	public void setChallengeUserGangMaps(List<ChallengeUserGangMap> challengeUserGangMaps) {
		this.challengeUserGangMaps = challengeUserGangMaps;
	}

	public ChallengeUserGangMap addChallengeUserGangMap(ChallengeUserGangMap challengeUserGangMap) {
		getChallengeUserGangMaps().add(challengeUserGangMap);
		challengeUserGangMap.setChallenge(this);

		return challengeUserGangMap;
	}

	public ChallengeUserGangMap removeChallengeUserGangMap(ChallengeUserGangMap challengeUserGangMap) {
		getChallengeUserGangMaps().remove(challengeUserGangMap);
		challengeUserGangMap.setChallenge(null);

		return challengeUserGangMap;
	}

}