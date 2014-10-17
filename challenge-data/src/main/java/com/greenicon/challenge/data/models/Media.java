package com.greenicon.challenge.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the media database table.
 * 
 */
@Entity
@Table(name="media")
@NamedQuery(name="Media.findAll", query="SELECT m FROM Media m")
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=64)
	private String id;

	@Column(nullable=false)
	private Timestamp createdts;

	@Column(nullable=false, length=16)
	private String extension;

	@Column(nullable=false, length=128)
	private String name;

	@Column(nullable=false, length=64)
	private String owner;

	@Column(nullable=false, length=128)
	private String path;

	@Column(name="REF_ID", nullable=false, length=64)
	private String refId;

	@Column(nullable=false, length=16)
	private String type;

	@Column(nullable=false)
	private Timestamp updatedts;

	//bi-directional many-to-one association to MediaData
	@OneToMany(mappedBy="media", fetch=FetchType.EAGER)
	private List<MediaData> mediaData;

	public Media() {
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

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getRefId() {
		return this.refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
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

	public List<MediaData> getMediaData() {
		return this.mediaData;
	}

	public void setMediaData(List<MediaData> mediaData) {
		this.mediaData = mediaData;
	}

	public MediaData addMediaData(MediaData mediaData) {
		getMediaData().add(mediaData);
		mediaData.setMedia(this);

		return mediaData;
	}

	public MediaData removeMediaData(MediaData mediaData) {
		getMediaData().remove(mediaData);
		mediaData.setMedia(null);

		return mediaData;
	}

}