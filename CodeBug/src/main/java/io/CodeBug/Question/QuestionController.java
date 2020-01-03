package io.CodeBug.Question;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.CodeBug.Common.BaseController;

@RestController
public class QuestionController extends BaseController {

	// The @Autowired Annotation injects the QuestionService Business class in the
	// QuestionController

	@Autowired
	private QuestionService questionService;

	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public List<Question> GetQuestions() {

		return questionService.getAllQuestion();

	}

	// We use @PathVariable annotation to map the variable "id" from the route to
	// the "id" parameter in the action
	// we can use different parameter name in the route and in the action but we
	// must specify it like this @PathVariable("differntParamName")
	@RequestMapping(value = "/questions/{id}", method = RequestMethod.GET)
	public Optional<Question> FindQuestion(@PathVariable Long id) {
		return questionService.FindQuestionById(id);
	}

	// In order to pass an object as parameter to the controller we must use the
	// @RequestBody annotation
	@RequestMapping(value = "/questions", method = RequestMethod.POST)
	public void AddQuestion(@RequestBody Question question) {

		questionService.AddQuestion(question);
	}

	@RequestMapping(value = "/questions/{id}", method = RequestMethod.PUT)
	public void updateQuestion(@RequestBody Question question, @PathVariable int id) {
		questionService.UpdateQuestion(question, id);
	}

	@RequestMapping(value = "/questions/{id}", method = RequestMethod.DELETE)
	public void deleteQuestion(@PathVariable Long id) {
		questionService.DeleteQuestion(id);
	}

}
