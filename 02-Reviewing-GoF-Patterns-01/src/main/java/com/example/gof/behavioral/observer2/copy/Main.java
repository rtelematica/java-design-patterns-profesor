package com.example.gof.behavioral.observer2.copy;

import java.util.Scanner;

import com.example.gof.behavioral.observer2.observable.Observable;
import com.example.gof.behavioral.observer2.observer.BinObserver;
import com.example.gof.behavioral.observer2.observer.Observer;

public class Main {

	public static void main(String[] args) {

		Observable observable = new Observable();

		observable.add(new BinObserver());

		observable.add(new Observer() {

			@Override
			public void observableStateChanged(Observable observable) {
				System.out.print(" " + Integer.toHexString(observable.getState()));
			}
		});

		observable.add(o -> System.out.print(" " + Integer.toHexString(o.getState())));

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number: ");
			observable.setState(scan.nextInt());
			System.out.println();
		}
	}
}
