package com.example.gof.behavioral.observer2.observer;

import com.example.gof.behavioral.observer2.observable.Observable;

public interface Observer {

	public void observableStateChanged(Observable observable);
}
