package com.example.gof.behavioral.observer3.observer;

import java.util.Observable;
import java.util.Observer;

import com.example.gof.behavioral.observer3.observable.SecurityCamera;

public class PoliceStation implements Observer {

	public PoliceStation() {

	}

	public PoliceStation(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		SecurityCamera sc = (SecurityCamera) o;
		System.out.println("Security Camera " + sc.getId() + " detect traspassing, sending police.");
	}

}
