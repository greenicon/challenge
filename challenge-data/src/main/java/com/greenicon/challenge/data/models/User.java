package com.greenicon.challenge.data.models;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(name="COVER_IMAGEID", nullable=false, length=64)
	private String coverImageid;

	@Column(name="CREATEDTS")//(nullable=false)
	private Timestamp createdts;

	@Column(name="CURRENT_LOCATIONID", length=64)
	private String currentLocationid;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dob;

	@Column(length=64)
	private String email;

	@Column(name="FIRST_NAME", nullable=false, length=64)
	private String firstName;

	@Column(length=1)
	private String gender;

	@Column(name="HOME_LOCATIONID", length=64)
	private String homeLocationid;

	@Column(name="LAST_NAME", length=64)
	private String lastName;

	@Column(length=16)
	private String mobilenumber;

	@Column(name="PROFILE_IMAGEID", nullable=false, length=64)
	private String profileImageid;

	@Column(name="UPDATEDTS")
	private Timestamp updatedts;

	//bi-directional many-to-one association to FriendsMap
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<FriendsMap> friendsMaps;  

	//bi-directional many-to-one association to GangUserMap
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<GangUserMap> gangUserMaps;

	//bi-directional many-to-one association to UserLogin
	@ManyToOne
	@JoinColumn(name="USER_LOGIN_ID")
	private UserLogin userLogin;

	//bi-directional many-to-one association to UserData
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<UserData> userData;

	public User() {
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

	public String getCurrentLocationid() {
		return this.currentLocationid;
	}

	public void setCurrentLocationid(String currentLocationid) {
		this.currentLocationid = currentLocationid;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeLocationid() {
		return this.homeLocationid;
	}

	public void setHomeLocationid(String homeLocationid) {
		this.homeLocationid = homeLocationid;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobilenumber() {
		return this.mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getProfileImageid() {
		return this.profileImageid;
	}

	public void setProfileImageid(String profileImageid) {
		this.profileImageid = profileImageid;
	}

	public Timestamp getUpdatedts() {
		return this.updatedts;
	}

	public void setUpdatedts(Timestamp updatedts) {
		this.updatedts = updatedts;
	}

	public List<FriendsMap> getFriendsMaps() {
		return this.friendsMaps;
	}

	public void setFriendsMaps(List<FriendsMap> friendsMaps) {
		this.friendsMaps = friendsMaps;
	}

	public FriendsMap addFriendsMaps(FriendsMap friendsMaps) {
		getFriendsMaps().add(friendsMaps);
		friendsMaps.setUser(this);

		return friendsMaps;
	}

	public FriendsMap removeFriendsMaps(FriendsMap friendsMaps) {
		getFriendsMaps().remove(friendsMaps);
		friendsMaps.setUser(null);

		return friendsMaps;
	}

	public List<GangUserMap> getGangUserMaps() {
		return this.gangUserMaps;
	}

	public void setGangUserMaps(List<GangUserMap> gangUserMaps) {
		this.gangUserMaps = gangUserMaps;
	}

	public GangUserMap addGangUserMap(GangUserMap gangUserMap) {
		getGangUserMaps().add(gangUserMap);
		gangUserMap.setUser(this);

		return gangUserMap;
	}

	public GangUserMap removeGangUserMap(GangUserMap gangUserMap) {
		getGangUserMaps().remove(gangUserMap);
		gangUserMap.setUser(null);

		return gangUserMap;
	}

	public UserLogin getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	public List<UserData> getUserData() {
		return this.userData;
	}

	public void setUserData(List<UserData> userData) {
		this.userData = userData;
	}

	public UserData addUserData(UserData userData) {
		getUserData().add(userData);
		userData.setUser(this);

		return userData;
	}

	public UserData removeUserData(UserData userData) {
		getUserData().remove(userData);
		userData.setUser(null);

		return userData;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [firstName=" + firstName+ ", lastName="
				+ lastName + ", id=" + id + ", coverImageid=" + coverImageid
				+ ", createdts=" + createdts + ", currentLocationid="
				+ currentLocationid + ", dob=" + dob + ", email=" + email
				+ ", gender=" + gender
				+ ", homeLocationid=" + homeLocationid  + ", mobilenumber=" + mobilenumber
				+ ", profileImageid=" + profileImageid + ", updatedts="
				+ updatedts + ", friendsMap=" + friendsMaps
				+ ", gangUserMaps="
				+ gangUserMaps + ", userLogin=" + userLogin + ", userData="
				+ userData + "]";
	}
	
	
}