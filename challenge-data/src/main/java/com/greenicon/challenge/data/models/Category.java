package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@Table(name="category")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
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

	@Column(nullable=false, length=128)
	private String name;

	@Column(name="PROFILE_MEDIAID", nullable=false, length=64)
	private String profileMediaid;

	@Column(nullable=false)
	private Timestamp updatedts;

	//bi-directional many-to-one association to CategoryCategorychallengeMap
	@OneToMany(mappedBy="category", fetch=FetchType.EAGER)
	private List<CategoryCategorychallengeMap> categoryCategorychallengeMaps;

	@Override
	public String toString() {
		return "Category [id=" + id + ", coverMediaid=" + coverMediaid
				+ ", createdts=" + createdts + ", description=" + description
				+ ", name=" + name + ", profileMediaid=" + profileMediaid
				+ ", updatedts=" + updatedts
				+ ", categoryCategorychallengeMaps="
				+ categoryCategorychallengeMaps + "]";
	}

	public Category() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfileMediaid() {
		return this.profileMediaid;
	}

	public void setProfileMediaid(String profileMediaid) {
		this.profileMediaid = profileMediaid;
	}

	public Timestamp getUpdatedts() {
		return this.updatedts;
	}

	public void setUpdatedts(Timestamp updatedts) {
		this.updatedts = updatedts;
	}

	public List<CategoryCategorychallengeMap> getCategoryCategorychallengeMaps() {
		return this.categoryCategorychallengeMaps;
	}

	public void setCategoryCategorychallengeMaps(List<CategoryCategorychallengeMap> categoryCategorychallengeMaps) {
		this.categoryCategorychallengeMaps = categoryCategorychallengeMaps;
	}

	public CategoryCategorychallengeMap addCategoryCategorychallengeMap(CategoryCategorychallengeMap categoryCategorychallengeMap) {
		getCategoryCategorychallengeMaps().add(categoryCategorychallengeMap);
		categoryCategorychallengeMap.setCategory(this);

		return categoryCategorychallengeMap;
	}

	public CategoryCategorychallengeMap removeCategoryCategorychallengeMap(CategoryCategorychallengeMap categoryCategorychallengeMap) {
		getCategoryCategorychallengeMaps().remove(categoryCategorychallengeMap);
		categoryCategorychallengeMap.setCategory(null);

		return categoryCategorychallengeMap;
	}

}