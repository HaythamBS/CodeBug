package io.CodeBug.Question;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int question_Id;
	@Column(name = "title")
	private String Title;
	@Column(name = "description")
	private String description;
	@Column(name = "is_answered")
	private Boolean isAnswered;
	@Column(name = "postedOn")
	private LocalDate postedOn;
	@Column(name = "updatedOn")
	private LocalDate lastUpdatedOn;
	@Column(name = "rating")
	private int rating;
	@Column(name = "viewCount")
	private int viewCount;
	
	

	public Question() {
		super();
	}

	public Question(int question_Id, String title, String description, Boolean isAnswered, LocalDate postedOn,
			LocalDate lastUpdatedOn, int rating, int viewCount) {
		super();
		this.question_Id = question_Id;
		Title = title;
		this.description = description;
		this.isAnswered = isAnswered;
		this.postedOn = LocalDate.now();
		this.lastUpdatedOn = lastUpdatedOn;
		this.rating = rating;
		this.viewCount = viewCount;
	}
	
	public int getQuestion_Id() {
		return question_Id;
	}
	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIsAnswered() {
		return isAnswered;
	}
	public void setIsAnswered(Boolean isAnswered) {
		this.isAnswered = isAnswered;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public LocalDate getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	public void setLastUpdatedOn(LocalDate lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	
	
	

}
