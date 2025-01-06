package javalearning.classes;

import lombok.*;

@Data
public class Student {

	static{
		System.out.println("Static Block here");
	}

	private String name;
	private int age;
	private String address;
	static String college = "XYZ";
	static int count = 0;

	public Student(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	static void studentCount(){
		count = count + 1;
	 }

	 int getCount(){
		return count;
	 }

/*
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString(){
		return ("Student Name:" + this.getName()+ ", age is"+ this.getAge()+
				", Address is:"+ this.getAddress() +"");
	}
*/
	public static void main(String[] args) {
		Student jahan = new Student("Jahan", 40, "8847 238th st");
		Student ahamed = new Student("Ahamd", 38, "8802 240th st");
		System.out.println(jahan.age);
		System.out.println(Student.college);
		System.out.println();
	}

	protected boolean canEqual(final Object other) {
		return other instanceof Student;
	}

}
