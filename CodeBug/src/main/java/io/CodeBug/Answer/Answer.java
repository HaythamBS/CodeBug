package io.CodeBug.Answer;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answer_Id;
	@Column(name = "description")
	private String description;
	@Column(name = "rating")
	private int rating;
	@Column(name = "is_accepted")
	private Boolean isAccepted;
	@Column(name = "postedOn")
	private Date postedOn;
	@Column(name = "updatedOn")
	private Date lastUpdatedOn;
	
	
	public int getAnswer_Id() {
		return answer_Id;
	}
	public void setAnswer_Id(int answer_Id) {
		this.answer_Id = answer_Id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Boolean getIsAccepted() {
		return isAccepted;
	}
	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
	public Date getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}
	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
}
