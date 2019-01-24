package com.parsons.elliott.springboot.garage.mySpringBootGarageApp.model;

import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

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
@Table (name = "film_list")
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
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}  
	
}