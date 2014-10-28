package com.greenicon.challenge.data.models;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;


/**
 * The persistent class for the friends_map database table.
 * 
 */
@Entity
@Table(name="friends_map")
@NamedQuery(name="FriendsMap.findAll", query="SELECT f FROM FriendsMap f")
public class FriendsMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(unique=true, nullable = false, length=64)
	private String id;

	@Column
	private Timestamp createdts;

	@Column
	private Timestamp updatedts;
	
	@Column(name="FRIEND_ID")
	private String friendId;

	
	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID", nullable=false)
	private User user;


	public FriendsMap() {
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

	/**
	 * @return the friendId
	 */
	public String getFriendId() {
		return friendId;
	}

	/**
	 * @param friendId the friendId to set
	 */
	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FriendsMap [id=" + id  + ", userId=" + (user == null ? null :user.getId()) 
				+ ", friendId=" + friendId
				+ ", createdts=" + createdts
				+ ", updatedts=" + updatedts + "]";
	}
	

}