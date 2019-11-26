package com.example.gof.creational.singleton.singleton;

import lombok.Getter;

public class LazySingleton {

	private @Getter String value;

	private static LazySingleton instance = null;

	private LazySingleton(String value) {
		this.value = value;
	}

	public static LazySingleton getInstance() {

		if (instance == null) {
			synchronized (LazySingleton.class) {
				instance = new LazySingleton("my value");
			}
		}
		return instance;
	}

}
