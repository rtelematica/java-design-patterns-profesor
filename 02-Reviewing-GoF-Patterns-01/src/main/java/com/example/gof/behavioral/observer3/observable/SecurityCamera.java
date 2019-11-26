package com.example.gof.behavioral.observer3.observable;

import java.util.Observable;

public class SecurityCamera extends Observable {

	private int id;

	public SecurityCamera(int id) {
		this.id = id;
	}

	public void detectTraspassing() {
		setChanged();
		notifyObservers();
	}

	public int getId() {
		return this.id;
	}
}
