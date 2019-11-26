package com.example.gof.behavioral.strategy.strategy;

public class SocialMediaConnector {

	private SocialMediaStrategy smStrategy;

	public void setSocialmediaStrategy(SocialMediaStrategy socialMediaStrategy) {
		this.smStrategy = socialMediaStrategy;
	}

	public void connect(String name) {
		smStrategy.connectTo(name);
	}

}
