package org.study.testdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.study.config.AppConfig;


public class Test {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
	}
}
