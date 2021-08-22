package com.ajith.demo;

public class BaseBallCoach implements Coach {
	
	FortuneService fortuneService;
	
	

	public BaseBallCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
		System.out.println("good");
		System.out.println("nice");
	}

	@Override
	public void dailyWorkOut() {
		System.out.println("Baseball workout");

	}

	@Override
	public void getFortune() {
		fortuneService.getFortune();
		
	}

}
