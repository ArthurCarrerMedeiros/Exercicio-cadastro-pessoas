package Entities;

public class Person {
	private String name;
	private Integer age;
	private Double height;
	
	Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	Person(){
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	private void setAge(Integer age) {
		this.age = age;
	}

	private double getHeight() {
		return height;
	}

	private void setHeight(Double height) {
		this.height = height;
	}

	public String toString() {
		return "\nName: " + name + "\nAge: " + age + "\nHeight: " + height + "\n";
	}
}
