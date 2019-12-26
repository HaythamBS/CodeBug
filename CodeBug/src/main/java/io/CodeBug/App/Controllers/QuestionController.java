package io.CodeBug.App.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

	@RequestMapping(value="/questions",method = RequestMethod.GET)
	public String GetQuestions() {
		return "All questions";
	}
	
	/**@RequestMapping(value="",method= RequestMethod.POST)
	public void AddQuestion() {
		
	}
	@RequestMapping(value="",method=RequestMethod.POST)
	public void deleteQuestion() {
		
	}
	@RequestMapping(value="",method = RequestMethod.PUT)
	public void updateQuestion() {
		
	}
	@RequestMapping(value="",method = RequestMethod.POST)
	public void SearchQuestion() {
		
	}**/
}
