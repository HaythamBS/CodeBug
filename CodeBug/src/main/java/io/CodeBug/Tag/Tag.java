package io.CodeBug.Tag;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import io.CodeBug.Question.Question;

@Entity
@Table(name="tags")
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tag_Id;
	@Column(name = "name")
	private int name;
	
	@ManyToMany(mappedBy="tags")
	private List<Question> questions;
	
	
	public Long getTag_Id() {
		return tag_Id;
	}
	public void setTag_Id(Long tag_Id) {
		this.tag_Id = tag_Id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	
}
