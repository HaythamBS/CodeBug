package io.CodeBug.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

	@Autowired
	private CommentService commentService;

	@RequestMapping(value="/questions/{id}",method = RequestMethod.POST)
	public void AddComment(@RequestBody Comment comment,@PathVariable int id) {

		commentService.AddComment(comment,id);

	}

	@RequestMapping(method = RequestMethod.PUT)
	public void updateComment(@RequestBody Comment comment, @PathVariable int id) {

		commentService.UpdateComment(comment, id);
	}

	public void DeleteComment(int id) {

		commentService.DeleteComment(id);
	}

}
