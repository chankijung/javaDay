package day12;

public class Ex05 {
	private String name;
	private int age;
	
	
	public void setName(String n) {
		name = n;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age-1;
	}
}
