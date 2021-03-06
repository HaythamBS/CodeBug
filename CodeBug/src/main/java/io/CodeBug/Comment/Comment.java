package io.CodeBug.Comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.CodeBug.Answer.Answer;

@Entity
@Table(name="comments")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long comment_Id;
	@Column(name = "content")
	private String content;
	@Column(name = "rating")
	private int rating;
		
	@ManyToOne
	@JoinColumn(name = "answer_Id", nullable = false)
	private Answer answer;
	
	
	
	public Long getComment_Id() {
		return comment_Id;
	}
	public void setComment_Id(Long comment_Id) {
		this.comment_Id = comment_Id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	
	
}
