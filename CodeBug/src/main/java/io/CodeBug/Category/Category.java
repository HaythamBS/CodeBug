package io.CodeBug.Category;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.CodeBug.Question.Question;

@Entity
@Table(name="categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_Id;
	@Column(name = "name")
	private int name;
	
	@OneToMany(mappedBy = "category")
	private List<Question> questions;
	
	
	public int getCategory_Id() {
		return category_Id;
	}
	
	public void setCategory_Id(int category_Id) {
		this.category_Id = category_Id;
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
