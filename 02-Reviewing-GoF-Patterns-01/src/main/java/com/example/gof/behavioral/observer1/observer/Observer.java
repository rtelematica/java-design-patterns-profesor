package com.example.gof.behavioral.observer1.observer;

import com.example.gof.behavioral.observer1.subject.Subject;

public abstract class Observer {

	protected Subject subject;

	public abstract void update();
}
