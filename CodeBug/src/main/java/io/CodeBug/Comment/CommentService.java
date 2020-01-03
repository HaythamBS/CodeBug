package io.CodeBug.Comment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.CodeBug.Answer.Answer;

@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	List<Comment> comments = new ArrayList<Comment>();
	List<Answer> answers = new ArrayList<Answer>();

	public void AddComment(Comment comment, int id) {

		Answer answer = answers.stream().filter(x -> x.getAnswer_Id() == id).findFirst().get();
		comment.setAnswer(answer);
		commentRepository.save(comment);
	}

	public void DeleteComment(Long id) {

		//comments.removeIf(x -> x.getComment_Id() == id);
		commentRepository.deleteById(id);

	}

	public void UpdateComment(Comment comment, int id) {

		/*
		 * Comment c = comments.stream().filter(x -> x.getComment_Id() ==
		 * id).findFirst().get(); int index = comments.indexOf(c); comments.set(index,
		 * comment);
		 */
		commentRepository.save(comment);

	}

}
