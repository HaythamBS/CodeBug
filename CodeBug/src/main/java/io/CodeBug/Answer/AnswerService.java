package io.CodeBug.Answer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.CodeBug.Comment.Comment;
import io.CodeBug.Question.Question;

@Service
public class AnswerService {

	@Autowired(required = true)
	private AnswerRepository answerRepository;
	

	List<Answer> answers = new ArrayList<Answer>();
	
	public List<Answer> getAllAnswers() {

		return (List<Answer>) answerRepository.findAll();
		
	}

	public void AddAnswer(Answer answer) {

		answerRepository.save(answer);
	}

	public void UpdateAnswer(Answer answer, int id) {

		/*
		 * Answer a = answers.stream().filter(x -> x.getAnswer_Id() ==
		 * id).findFirst().get(); int index = answers.indexOf(a); answers.set(index,
		 * answer);
		 */
		answerRepository.save(answer);
	}

	public void DeleteAnswer(Long id) {

		answerRepository.deleteById(id);
		//answers.removeIf(x -> x.getAnswer_Id() == id);
	}
}
