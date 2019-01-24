package com.parsons.ellott.springboot.sakila.mySpringBootSakilaModel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="film_list")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"lastModified"}, allowGetters = true)

public class MySpringBootSakilaDataModel implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "FID") private Long filmId;
	
	@NotBlank
	@Column (name = "title") private String title;
	 
	@NotBlank
	@Column (name = "description") private String description;
	
	@NotBlank
	@Column (name = "category") private String category;
	
	@NotBlank
	@Column (name = "length") private int length;
	
	@NotBlank
	@Column(name = "rating") private String rating;

	@Column(nullable = false,updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date lastModified;
	
	public MySpringBootSakilaDataModel() {	
	}
	
	public MySpringBootSakilaDataModel(String title, String description, String category, int length, String rating)
	{
		this.title=title;
		this.description=description;
		this.category=category;
		this.length=length; 
		this.rating=rating;
	}
	public Long getFilmId() {
		return this.filmId;
	}
	public void setId(Long id) {
		this.filmId = filmId;
	}
	public String getTitle() {
		return this.title;
	}
	public String setTitle(String title) {
		return this.title = title;
	}
	public String getDescription() {
		return this.description;
	}
	public String setDescription(String description) {
		return this.description = description;
	}
	public String getCategory() {
		return this.category;
	}
	public String setCategory(String category) {
		return this.category = category;
	}
	public int setLength() {
		return this.length;
	}
	public int getLength(int length) {
		return this.length = length;
	}
	public String setRating() {
		return this.rating;
	}
	public String getRating(String rating) {
		return this.rating=rating;
	}
	public Date setLastModified() {
		return this.lastModified;
	}
	public Date getLastModified(Date lastModified) {
		return this.lastModified = lastModified;
	}
}
