package com.example.gof.behavioral.observer1.observer;

import com.example.gof.behavioral.observer1.subject.Subject;

public class BinObserver extends Observer {
	
	public BinObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.print(" " + Integer.toBinaryString(subject.getState()));
	}
}