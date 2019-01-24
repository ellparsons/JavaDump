package com.parsons.elliott.springboot.garage.mySpringBootSakilaApp.model;

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

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "vehicles")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"creationDate","lastModified"}, allowGetters = true)
public class MySpringBootDataModel implements Serializable 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FID")private Long id;
	
	@NotBlank
	@Column(name="title")private String title;
	
	@NotBlank
	@Column(name="description")private String description;
	
	@NotBlank
	@Column(name="category")private String category;
	
	@NotBlank
	@Column(name="length")private int length;
	
	@NotBlank
	@Column(name="price")private int price;
	
	@NotBlank
	@Column(name="rating")private String rating;
	 
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date creationDate;
	
	@Column(nullable = false, updatable =false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date lastModified;

	public MySpringBootDataModel()
	{
	} 
	public MySpringBootDataModel(String title, String description, String category, int length, int price, String rating) 
	{ 
		this.title=title;
		this.description=description;
		this.category=category;
		this.length=length;
		this.price=price;
		this.rating=rating;
	}  
	public Long getId() {
		return this.id;   
	} 
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) { 
		this.description = description;
	}
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int setLength() {
		return this.length;
	}
	public void getLength(int length) {
		this.length = length;
	}
	public int setPrice() {
		return this.price;
	}
	public void getPrice(int price) {
		this.price = price;
	}
	public Date setCreationDate() {
		return this.creationDate;
	}
	public void getCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date setLastModified() {
		return this.lastModified;
	}
	public void getLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	
}
