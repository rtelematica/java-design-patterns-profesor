package com.example.gof.behavioral.strategy.strategy.impl;

import com.example.gof.behavioral.strategy.strategy.SocialMediaStrategy;

public class LinkedinStrategy implements SocialMediaStrategy {

	public void connectTo(String friendName) {
		System.out.println("Connecting with " + friendName + " through Linkedin");
	}
}