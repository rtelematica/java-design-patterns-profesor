package com.example.gof.behavioral.observer2.observer;

import com.example.gof.behavioral.observer2.observable.Observable;

public class BinObserver implements Observer {

	@Override
	public void observableStateChanged(Observable observable) {
		System.out.print(" " + Integer.toBinaryString(observable.getState()));
	}

}