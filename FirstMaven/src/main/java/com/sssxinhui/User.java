package com.sssxinhui;

import java.util.Set;

public class User {
	private String id;
	private String name;
	private int age;
	private Set<Score> score;
	
	public Set<Score> getScore() {
		return score;
	}
	public void setScore(Set<Score> score) {
		this.score = score;
	}
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
