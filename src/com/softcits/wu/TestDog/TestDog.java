package com.softcits.wu.TestDog;

import com.softcits.wu.Testextends.Dog;

public class TestDog {
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.name);
		//挎包
		//System.out.println(d.height);
		System.out.println(d.getAge());
		System.out.println(d.name);
	}
}
