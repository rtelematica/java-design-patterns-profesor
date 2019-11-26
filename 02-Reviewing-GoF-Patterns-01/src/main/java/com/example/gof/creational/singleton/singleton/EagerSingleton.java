package com.example.gof.creational.singleton.singleton;

import lombok.Getter;

public class EagerSingleton {

	private @Getter String value;

	private static final EagerSingleton instance = new EagerSingleton("my value");

	private EagerSingleton(String value) {
		this.value = value;
	}

	public static EagerSingleton getInstance() {
		return instance;
	}

}
