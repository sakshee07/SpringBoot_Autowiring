package com.autowire.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("octopusHeart")
	private Heart heart;
	
//	public Human() {
//		
//	}
//
//	
//	public Human(Heart heart) {
//		this.heart = heart;
//		System.out.println("humn const called");
//	}
//	
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("settermethod called");
//	}

	public void startPumping() {

		if (heart != null) {
			heart.pump();
			System.out.println("name of animal : "+heart.getNameOfAnimal()+"no of heart : "+ heart.getNoOfHeart());
		} else {
			System.out.println("u are dead");
		}

	}

}
