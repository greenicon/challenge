package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the challenge_group_map database table.
 * 
 */
@Entity
@Table(name="challenge_group_map")
@NamedQuery(name="ChallengeGroupMap.findAll", query="SELECT c FROM ChallengeGroupMap c")
public class ChallengeGroupMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(nullable=false)
	private Timestamp createdts;

	@Column(nullable=false)
	private Timestamp updatedts;

	//bi-directional many-to-one association to Challenge
	@ManyToOne
	@JoinColumn(name="CHALLENGE_ID", nullable=false)
	private Challenge challenge1;

	//bi-directional many-to-one association to Challenge
	@ManyToOne
	@JoinColumn(name="CHALLENGE_GROUP_ID", nullable=false)
	private Challenge challenge2;

	public ChallengeGroupMap() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getCreatedts() {
		return this.createdts;
	}

	public void setCreatedts(Timestamp createdts) {
		this.createdts = createdts;
	}

	public Timestamp getUpdatedts() {
		return this.updatedts;
	}

	public void setUpdatedts(Timestamp updatedts) {
		this.updatedts = updatedts;
	}

	public Challenge getChallenge1() {
		return this.challenge1;
	}

	public void setChallenge1(Challenge challenge1) {
		this.challenge1 = challenge1;
	}

	public Challenge getChallenge2() {
		return this.challenge2;
	}

	public void setChallenge2(Challenge challenge2) {
		this.challenge2 = challenge2;
	}

}