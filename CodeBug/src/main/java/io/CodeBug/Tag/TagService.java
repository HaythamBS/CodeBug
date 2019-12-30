package io.CodeBug.Tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.CodeBug.Answer.Answer;

@Service
public class TagService {

	@Autowired
	private TagRepository tagRepository; 
	
	public List<Answer> getAllTags() {
		// TODO Auto-generated method stub
		return null;
	}

	public void AddTag(Answer answer) {
		// TODO Auto-generated method stub
		
	}

	public void UpdateTag(Answer answer, int id) {
		// TODO Auto-generated method stub
		
	}

	public void DeleteTag(int id) {
		// TODO Auto-generated method stub
		
	}

}
