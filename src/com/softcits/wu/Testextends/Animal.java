package com.softcits.wu.Testextends;

public class Animal {
	public String name;
	double weight;
	protected double height;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal(String name, double weight, double height, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}
	public Animal() {
		super();
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", height=" + height + ", age=" + age + "]";
	}
	
	public void run() {
		System.out.println("动物跑");
	}
}
