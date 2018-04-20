package top.sssxinhui.entitys;

import java.sql.Blob;
import java.util.Set;

public class Student {
	private int id;
	
	private String name;
	
	private Set<Score> score;
	
	private Blob picture;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Score> getScore() {
		return score;
	}

	public void setScore(Set<Score> score) {
		this.score = score;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", picture=" + picture + "]";
	}
	
	
}
