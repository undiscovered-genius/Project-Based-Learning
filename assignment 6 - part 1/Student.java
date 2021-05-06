package assignment6;

public class Student {
	private String name;
	private int roll;
	private float mark1, mark2;
	
	public Student(String name,int roll,float mark1,float mark2) {
		this.name = name;
		this.roll = roll;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public float getMark2() {
		return mark2;
	}
	public void setMark2(float mark2) {
		this.mark2 = mark2;
	}
	public float getMark1() {
		return mark1;
	}
	public void setMark1(float mark1) {
		this.mark1 = mark1;
	}
}
