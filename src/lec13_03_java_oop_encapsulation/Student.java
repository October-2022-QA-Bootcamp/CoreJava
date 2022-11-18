package lec13_03_java_oop_encapsulation;

public class Student {
	private String stName;
	private int stId;
	private char sex;
	private boolean fulltimeSt;
	private float grade;
	
	// LINE 11-16, asked in interview to write the code, so we generally mass up which one is return and which one is void
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public boolean isFulltimeSt() {
		return fulltimeSt;
	}
	public void setFulltimeSt(boolean fulltimeSt) {
		this.fulltimeSt = fulltimeSt;
	}
	
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}

}
