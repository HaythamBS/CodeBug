package io.CodeBug.Answer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.CodeBug.Comment.Comment;
import io.CodeBug.Question.Question;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepository answerRepository;
	
	List<Answer> answers = new ArrayList<Answer>();
	
	public List<Answer> getAllAnswers() {

		return answers;
	}

	public void AddAnswer(Answer answer) {

		answers.add(answer);
	}

	public void UpdateAnswer(Answer answer, int id) {

		Answer a = answers.stream().filter(x -> x.getAnswer_Id() == id).findFirst().get();
		int index = answers.indexOf(a);
		answers.set(index, answer);
	}

	public void DeleteAnswer(int id) {

		answers.removeIf(x -> x.getAnswer_Id() == id);
	}
}
