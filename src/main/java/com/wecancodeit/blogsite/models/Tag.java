package com.wecancodeit.blogsite.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;
	private String tagName;
	
	@ManyToMany(mappedBy="tags")
	private Collection<Post> posts;
	
	public Tag () {}
	
	public Tag(String tagName) {
		this.tagName = tagName;
	}
	
	public Collection<Post> getPosts() {
		return posts;
	}

	public Long getId() {
		return id;
	}

	public String getTagName() {
		return tagName;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", tagName=" + tagName + "]";
	}
	
}
