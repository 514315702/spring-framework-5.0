package org.study.testdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study.bean.User;

public class TestSpring5 {

	public static void main(String[] args) {
			//1 加载spring配置文件
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
			//2 获取配置创建的对象
			User user = context.getBean("user", User.class);
			System.out.println(user);
	}
}
