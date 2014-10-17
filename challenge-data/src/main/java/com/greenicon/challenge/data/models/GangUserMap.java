package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the gang_user_map database table.
 * 
 */
@Entity
@Table(name="gang_user_map")
@NamedQuery(name="GangUserMap.findAll", query="SELECT g FROM GangUserMap g")
public class GangUserMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(nullable=false)
	private Timestamp createdts;

	@Column(nullable=false)
	private Timestamp updatedts;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID", nullable=false)
	private User user;

	//bi-directional many-to-one association to Gang
	@ManyToOne
	@JoinColumn(name="GANG_ID", nullable=false)
	private Gang gang;

	public GangUserMap() {
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

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Gang getGang() {
		return this.gang;
	}

	public void setGang(Gang gang) {
		this.gang = gang;
	}

}