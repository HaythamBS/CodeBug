package io.CodeBug.Tag;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tags")
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tag_Id;
	@Column(name = "name")
	private int name;
	
	
	public int getTag_Id() {
		return tag_Id;
	}
	public void setTag_Id(int tag_Id) {
		this.tag_Id = tag_Id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
	
	
}
