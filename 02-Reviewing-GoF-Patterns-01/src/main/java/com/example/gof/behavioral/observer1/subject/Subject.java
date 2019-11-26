package com.example.gof.behavioral.observer1.subject;

import java.util.ArrayList;
import java.util.List;

import com.example.gof.behavioral.observer1.observer.Observer;

public class Subject {

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
		observers.forEach(Observer::update);
	}
}
