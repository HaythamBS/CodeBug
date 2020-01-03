package io.CodeBug.Question;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.CodeBug.Answer.Answer;
import io.CodeBug.Category.Category;
import io.CodeBug.Tag.Tag;

@Entity
@Table(name = "questions")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long question_Id;
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
	private Boolean isDuplicated;

	@OneToMany(mappedBy = "question")
	private List<Answer> answers;

	@ManyToOne
	@JoinColumn(name = "category_Id", nullable = false)
	private Category category;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "question_tags", joinColumns = { @JoinColumn(name = "question_Id") }, inverseJoinColumns = {
			@JoinColumn(name = "tag_Id") })
	private List<Tag> tags;

	public Question() {
		super();
	}

	public Question(Long question_Id, String title, String description, Boolean isAnswered, LocalDate postedOn,
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

	public Long getQuestion_Id() {
		return question_Id;
	}

	
	public void setQuestion_Id(Long question_Id) {
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

	public Boolean getIsDuplicated() {
		return isDuplicated;
	}

	public void setIsDuplicated(Boolean isDuplicated) {
		this.isDuplicated = isDuplicated;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

}
