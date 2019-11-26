package com.example.gof.behavioral.strategy.copy;

import com.example.gof.behavioral.strategy.strategy.SocialMediaConnector;
import com.example.gof.behavioral.strategy.strategy.impl.FacebookStrategy;
import com.example.gof.behavioral.strategy.strategy.impl.GooglePlusStrategy;
import com.example.gof.behavioral.strategy.strategy.impl.LinkedinStrategy;
import com.example.gof.behavioral.strategy.strategy.impl.TwitterStrategy;

public class Main {

	public static void main(String[] args) throws Exception {

		SocialMediaConnector socialMediaConnector = new SocialMediaConnector();

		socialMediaConnector.setSocialmediaStrategy(new FacebookStrategy());
		socialMediaConnector.connect("xvanhalenx");

		System.out.println("====================");

		socialMediaConnector.setSocialmediaStrategy(new TwitterStrategy());
		socialMediaConnector.connect("xvanhalenx");

		System.out.println("====================");

		socialMediaConnector.setSocialmediaStrategy(new GooglePlusStrategy());
		socialMediaConnector.connect("xvanhalenx");

		System.out.println("====================");

		socialMediaConnector.setSocialmediaStrategy(new LinkedinStrategy());
		socialMediaConnector.connect("xvanhalenx");
	}
}
