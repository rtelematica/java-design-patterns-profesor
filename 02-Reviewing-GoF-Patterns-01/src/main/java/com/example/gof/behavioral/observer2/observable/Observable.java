package com.example.gof.behavioral.observer2.observable;

import java.util.ArrayList;
import java.util.List;

import com.example.gof.behavioral.observer2.observer.Observer;


public class Observable {

	private List<Observer> observers = new ArrayList<>();
	private int state;

	public void add(Observer observer) {
		observers.add(observer);
	}

	public int getState() {
		return state;
	}

	public void setState(int value) {
		this.state = value;
		notifyObservers();
	}

	private void notifyObservers() {
		observers.forEach( observer -> observer.observableStateChanged(this));
	}
}
