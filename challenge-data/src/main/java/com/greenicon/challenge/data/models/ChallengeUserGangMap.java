package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the challenge_user__gang_map database table.
 * 
 */
@Entity
@Table(name="challenge_user__gang_map")
@NamedQuery(name="ChallengeUserGangMap.findAll", query="SELECT c FROM ChallengeUserGangMap c")
public class ChallengeUserGangMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(name="CHALLENGEE_ID", nullable=false, length=64)
	private String challengeeId;

	@Column(name="CHALLENGER_ID", nullable=false, length=64)
	private String challengerId;

	@Column(nullable=false)
	private Timestamp createdts;

	@Column(nullable=false, length=1)
	private String state;

	@Column(nullable=false, length=1)
	private String type;

	@Column(nullable=false)
	private Timestamp updatedts;

	//bi-directional many-to-one association to Challenge
	@ManyToOne
	@JoinColumn(name="CHALLENGE_ID", nullable=false)
	private Challenge challenge;

	public ChallengeUserGangMap() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChallengeeId() {
		return this.challengeeId;
	}

	public void setChallengeeId(String challengeeId) {
		this.challengeeId = challengeeId;
	}

	public String getChallengerId() {
		return this.challengerId;
	}

	public void setChallengerId(String challengerId) {
		this.challengerId = challengerId;
	}

	public Timestamp getCreatedts() {
		return this.createdts;
	}

	public void setCreatedts(Timestamp createdts) {
		this.createdts = createdts;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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

	public Challenge getChallenge() {
		return this.challenge;
	}

	public void setChallenge(Challenge challenge) {
		this.challenge = challenge;
	}

}