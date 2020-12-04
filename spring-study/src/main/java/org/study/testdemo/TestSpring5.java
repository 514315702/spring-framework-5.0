package org.study.testdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.study.bean.User;

public class TestSpring5 {

	public static void main(String[] args) {
//			//1 加载spring配置文件
//			ApplicationContext context = new ClassPathXmlApplicationContext();
//			//2 获取配置创建的对象
//			User user = context.getBean("user", User.class);
//			System.out.println(user);
		ClassPathResource classPathResource = new ClassPathResource("spring-context.xml");
		BeanFactory bf= new XmlBeanFactory(classPathResource);
		User user = bf.getBean("user", User.class);
        System.out.println(user);
	}
}
