package io.CodeBug.Answer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.CodeBug.Question.Question;
import io.CodeBug.Question.QuestionService;

@RestController
public class AnswerController {

	// The @Autowired Annotation injects the QuestionService Business class in the
	// QuestionController

	@Autowired
	private AnswerService answerService;

	@RequestMapping(value = "/answers", method = RequestMethod.GET)
	public List<Answer> Getanswers() {

		return answerService.getAllAnswers();

	}

	// In order to pass an object as parameter to the controller we must use the
	// @RequestBody annotation

	@RequestMapping(value = "/answers", method = RequestMethod.POST)
	public void AddAnswer(@RequestBody Answer answer) {

		answerService.AddAnswer(answer);
	}

	@RequestMapping(value = "/answers/{id}", method = RequestMethod.PUT)
	public void updateAnswer(@RequestBody Answer answer, @PathVariable int id) {
		answerService.UpdateAnswer(answer, id);
	}

	@RequestMapping(value = "/answers/{id}", method = RequestMethod.DELETE)
	public void deleteAnswer(@PathVariable Long id) {
		answerService.DeleteAnswer(id);
	}
}
