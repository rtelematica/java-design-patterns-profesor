package com.example.gof.behavioral.observer1.observer;

import com.example.gof.behavioral.observer1.subject.Subject;

public class HexObserver extends Observer {

	public HexObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.print(" " + Integer.toHexString(subject.getState()));
	}
}