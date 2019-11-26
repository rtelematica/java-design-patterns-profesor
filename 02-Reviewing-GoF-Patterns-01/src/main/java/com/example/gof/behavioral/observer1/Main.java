package com.example.gof.behavioral.observer1;

import java.util.Scanner;

import com.example.gof.behavioral.observer1.observer.BinObserver;
import com.example.gof.behavioral.observer1.observer.HexObserver;
import com.example.gof.behavioral.observer1.observer.OctObserver;
import com.example.gof.behavioral.observer1.subject.Subject;

public class Main {

	public static void main(String[] args) {

		Subject sub = new Subject();

		new HexObserver(sub);
		new OctObserver(sub);
		new BinObserver(sub);

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number: ");
			sub.setState(scan.nextInt());
			System.out.println();
		}
	}
}
