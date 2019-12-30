package io.CodeBug.Question;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.CodeBug.Comment.Comment;

//This annotation @Service sets this class as a BusinessService which is always  used as a singelton

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	private List<Question> questions = new ArrayList<>(
			Arrays.asList(new Question(1, "Question 1", "Content 1", false, LocalDate.now(), LocalDate.now(), 0, 1),
					new Question(2, "Question 2", "Content 2", true, LocalDate.now(), LocalDate.now(), 0, 5),
					new Question(3, "Question 3", "Content 3", false, LocalDate.now(), LocalDate.now(), 0, 28),
					new Question(4, "Question 4", "Content 4", false, LocalDate.now(), LocalDate.now(), 0, 156)));

	public List<Question> getAllQuestion() {

		return questions;
	}

	public Question FindQuestionById(int id) {

		return questions.stream().filter(x -> x.getQuestion_Id() == id).findFirst().get();
	}

	public void AddQuestion(Question question) {

		questions.add(question);
	}

	public void UpdateQuestion(Question question, int id) {

		Question q = questions.stream().filter(x -> x.getQuestion_Id() == id).findFirst().get();
		int index = questions.indexOf(q);
		questions.set(index, question);
	}

	public void DeleteQuestion(int id) {

		questions.removeIf(x -> x.getQuestion_Id() == id);
	}
}
