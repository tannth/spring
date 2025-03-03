package com.musicstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Genre")
public class Genre {
	@Id
	@Column(name ="genreId")
	private Long genreId;
	@Column(name ="name")
	private String name;
	@Column(name ="description")
	private String description;

	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getGenreId() {
		return genreId;
	}

	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
