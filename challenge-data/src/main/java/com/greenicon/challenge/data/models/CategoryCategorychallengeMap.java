package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the category_categorychallenge_map database table.
 * 
 */
@Entity
@Table(name="category_categorychallenge_map")
@NamedQuery(name="CategoryCategorychallengeMap.findAll", query="SELECT c FROM CategoryCategorychallengeMap c")
public class CategoryCategorychallengeMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(nullable=false, length=64)
	private String childid;

	@Column(nullable=false)
	private Timestamp createdts;

	@Column(name="ISCHILD_CATEGORY", nullable=false)
	private byte ischildCategory;

	@Column(nullable=false)
	private Timestamp updatedts;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="PARENTID", nullable=false)
	private Category category;

	public CategoryCategorychallengeMap() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChildid() {
		return this.childid;
	}

	public void setChildid(String childid) {
		this.childid = childid;
	}

	public Timestamp getCreatedts() {
		return this.createdts;
	}

	public void setCreatedts(Timestamp createdts) {
		this.createdts = createdts;
	}

	public byte getIschildCategory() {
		return this.ischildCategory;
	}

	public void setIschildCategory(byte ischildCategory) {
		this.ischildCategory = ischildCategory;
	}

	public Timestamp getUpdatedts() {
		return this.updatedts;
	}

	public void setUpdatedts(Timestamp updatedts) {
		this.updatedts = updatedts;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}