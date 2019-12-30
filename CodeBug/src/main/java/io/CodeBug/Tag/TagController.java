package io.CodeBug.Tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.CodeBug.Answer.Answer;

@RestController
public class TagController {

	@Autowired
	private TagService tagService;
	
	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public List<Answer> Getanswers() {

		return tagService.getAllTags();

	}

	// In order to pass an object as parameter to the controller we must use the
	// @RequestBody annotation
	@RequestMapping(value = "/questions", method = RequestMethod.POST)
	public void AddAnswer(@RequestBody Answer answer) {

		tagService.AddTag(answer);
	}

	@RequestMapping(value = "/questions/{id}", method = RequestMethod.PUT)
	public void updateAnswer(@RequestBody Answer answer, @PathVariable int id) {
		tagService.UpdateTag(answer, id);
	}

	@RequestMapping(value = "/questions/{id}", method = RequestMethod.DELETE)
	public void deleteAnswer(@PathVariable int id) {
		tagService.DeleteTag(id);
	}
	
}
