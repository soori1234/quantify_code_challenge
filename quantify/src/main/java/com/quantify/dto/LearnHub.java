package com.quantify.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "course")
public class LearnHub {
	  private Integer pnum;
	  private String title;
	  private String image;
	  private String url;
	  private String price;
	  private String type;
	  private String category;
	  private String rating;
	  private String description;
	
	
	public Integer getPnum() {
		return pnum;
	}
	@XmlElement
	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}
	
	
	public String getTitle() {
		return title;
	}
	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getImage() {
		return image;
	}
	@XmlElement
	public void setImage(String image) {
		this.image = image;
	}
	
	
	public String getUrl() {
		return url;
	}
	@XmlElement
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public String getPrice() {
		return price;
	}
	@XmlElement
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	public String getType() {
		return type;
	}
	@XmlElement
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCategory() {
		return category;
	}
	@XmlElement
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getRating() {
		return rating;
	}
	@XmlElement
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	public String getDescription() {
		return description;
	}
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	 
	  
}
