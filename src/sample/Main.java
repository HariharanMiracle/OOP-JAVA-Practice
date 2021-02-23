package sample;

import java.util.HashSet;
import java.util.Set;

interface Nonveg{
	public void eatingNonVeg();
}

interface Veg{
	public void eatingVeg();
}

class Eat implements Nonveg, Veg{
	@Override
	public void eatingVeg() {
		// TODO Auto-generated method stub
		System.out.println("Eating veg");
	}

	@Override
	public void eatingNonVeg() {
		// TODO Auto-generated method stub
		System.out.println("Eating non veg");
	}
	
}

abstract class Test{
	public abstract void method1();
	public void method2(){
		System.out.println("Hello");
	}
}

class TestChild extends Test{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method 1");
	}
	
}

class Person 
{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	public void person() {
		System.out.println("Person Class");
	}
}

class Student extends Person{
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String studentNo;

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	@Override
	public String toString() {
		String person = "Person [name=" + getName() + "]";
		String student =  "Student [studentNo=" + studentNo + "]";
		return person + " === " + student;
	}
	
	public void student() {
		System.out.println("Student class");
	}
	
	public void student(int x) {
		System.out.println("Student class " + x);
	}
}

class Shape
{
	public String name;

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
}

public class Main {
	public static void main(String args[]) {
		Person p = new Person("");
		p.setName("Hanar");
		System.out.println(p.toString());
		
		Shape s = new Shape();
		s.name = "Circle";
		System.out.println(s.toString());
		
		Student std = new Student("");
		std.setName("Hanar");
		std.setStudentNo("asdf");
		
		System.out.println(std.toString());
		std.person();
		std.student();
		std.student(1);
		
		TestChild test = new TestChild();
		test.method1();
		test.method2();
		
		Eat eat = new Eat();
		eat.eatingNonVeg();
		eat.eatingVeg();
		
		HashSet<String> set = new HashSet<String>();
		set.add("Hari");
		set.add("Hari");
		System.out.println(set.toString());
	}
}
