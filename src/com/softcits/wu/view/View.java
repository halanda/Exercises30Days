package com.softcits.wu.view;

import java.util.Scanner;

import com.softcits.wu.dao.UserDao;
import com.softcits.wu.entity.User;

public class View {

	public static void main(String[] args) {
		User u = new User();
		UserDao userDao = new UserDao();
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("欢迎您");
		System.out.println("请选择：1登录 2注册 3.。。。。");
		int input = sc.nextInt();
		if (input == 1) {
			System.out.println("请输入用户名");
			
			u.setUsername(sc.next());
			System.out.println("请输入密码");
			u.setUserPassword(sc.next());
			//输入完用户名和密码，调用登录方法，登录方法是UserDao 所以？实例化UserDao
			if (userDao.login(u)) {
				System.out.println("欢迎使用，登陆成功");
				System.out.println("1.通过名字查数据 2.用过id查数据");
				input = sc.nextInt();
				if (input == 1) {
					//调用通过名字查数据的方法
					//请输入要查询的名字
					System.out.println("请输名字");
					u.setUsername(sc.next());
					userDao.selectByName(u);
					if (u!=null) {
						System.out.println(u.toString());
					}
				}
			}else {
				System.out.println("用户名或者密码错误");
			}
		}
		if (input == 2) {

		}
	}

}
