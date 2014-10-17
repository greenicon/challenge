package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the user_login database table.
 * 
 */
@Entity
@Table(name="user_login")
@NamedQuery(name="UserLogin.findAll", query="SELECT u FROM UserLogin u")
public class UserLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(nullable=false)
	private Timestamp createdts;

	@Column(nullable=false, length=64)
	private String password;

	@Column(nullable=false)
	private Timestamp updatedts;

	@Column(name="USER_NAME", nullable=false, length=64)
	private String userName;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="userLogin", fetch=FetchType.EAGER)
	private List<User> users;

	public UserLogin() {
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getUpdatedts() {
		return this.updatedts;
	}

	public void setUpdatedts(Timestamp updatedts) {
		this.updatedts = updatedts;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setUserLogin(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setUserLogin(null);

		return user;
	}

}