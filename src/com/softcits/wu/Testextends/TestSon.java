package com.softcits.wu.Testextends;

public class TestSon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son = new Son();
		//方法的重写 条件：继承下 子类重写父类方法 返回值 方法名 参数列表 一致
		//方法的重载 在本类里 方法名一致 参数列表不一样 （个数 类型 顺序）
		son.earnMoney();
	}

}
