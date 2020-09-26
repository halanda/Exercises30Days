package com.softcits.wu.dao;

import java.util.Scanner;

import com.softcits.wu.entity.User;

public class UserDao {
	static User[] arr = new User[10];
	static {
		// 创建用户 赋值给数组
		User user1 = new User("u1", "admin", "123", "大连", "1365432432", 1);
		User user2 = new User("u2", "test", "123", "北京", "136512311232", 0);
		User user3 = new User("u3", "scott", "123", "大连", "136123432", 0);
		User user4 = null;
		arr[0] = user1;
		arr[1] = user2;
		arr[2] = user3;
		arr[3] = user4;
	}
	//通过名字查询，看是否存在
	public boolean checkUsername(String username) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=null&&arr[i].getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	//查询所有 返回一个数组
	public User[] selectAll() {
		return arr;
	}
	
	public int test() {
		return 0;
	}
	
	public User[] selectByKey(String k) {
		User[] arr = new User[10];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=null&&arr[i].getUsername().contains(k)) {
				return arr;
			}
		}
		return null;
		
	}
	
	

	// 定义登陆方法
	public boolean login(User u) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getUsername().equals(u.getUsername())
					&& arr[i].getUserPassword().equals(u.getUserPassword())) {
				return true;
			}
		}
		return false;
	}
	
	//通过名字查数据
	public User selectByName(User u) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=null&&arr[i].getUsername().equals(u.getUsername())) {
				return arr[i];
			}
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入名字：");
		
		boolean a = userDao.checkUsername(sc.next());
		if (a) {
			System.out.println("存在");
		} else {
			//调用注册
		}
	}
}
