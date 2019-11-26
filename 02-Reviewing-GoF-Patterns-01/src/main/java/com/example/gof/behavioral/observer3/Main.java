package com.example.gof.behavioral.observer3;

import com.example.gof.behavioral.observer3.observable.SecurityCamera;
import com.example.gof.behavioral.observer3.observer.PoliceStation;

public class Main {

	public static void main(String[] args) {
		SecurityCamera sc = new SecurityCamera(123);
		
		//sc.addObserver(new PoliceStation());
		//sc.addObserver(new PoliceStation());
		
		new PoliceStation(sc);
		new PoliceStation(sc);
		new PoliceStation(sc);
		
		sc.detectTraspassing();
		
	}
}
