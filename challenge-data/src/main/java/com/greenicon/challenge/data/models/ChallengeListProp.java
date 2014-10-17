package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the challenge_list_props database table.
 * 
 */
@Entity
@Table(name="challenge_list_props")
@NamedQuery(name="ChallengeListProp.findAll", query="SELECT c FROM ChallengeListProp c")
public class ChallengeListProp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(nullable=false)
	private Timestamp createdts;

	@Column(nullable=false, length=64)
	private String name;

	@Column(nullable=false)
	private Timestamp updatedts;

	@Column(nullable=false, length=64)
	private String value;

	//bi-directional many-to-one association to ChallengeList
	@ManyToOne
	@JoinColumn(name="CHALLENGE_LIST_ID", nullable=false)
	private ChallengeList challengeList;

	public ChallengeListProp() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getUpdatedts() {
		return this.updatedts;
	}

	public void setUpdatedts(Timestamp updatedts) {
		this.updatedts = updatedts;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ChallengeList getChallengeList() {
		return this.challengeList;
	}

	public void setChallengeList(ChallengeList challengeList) {
		this.challengeList = challengeList;
	}

}