package com.ajith.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("BaseballCoach",Coach.class);
		
		coach.dailyWorkOut();
		
		coach.getFortune();

	}

}
