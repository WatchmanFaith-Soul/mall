package top.sssxinhui.entitys;

public class Score {
	private int id;
	
	private String courseName;
	
	private Student student;
	
	private double course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public double getCourse() {
		return course;
	}

	public void setCourse(double course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", courseName=" + courseName +  ", course=" + course + "]";
	}
	
	
}
