package com.example.gof.creational.singleton;

import com.example.gof.creational.singleton.singleton.EagerSingleton;
import com.example.gof.creational.singleton.singleton.LazySingleton;

public class Main {

	public static void main(String[] args) {

		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton3 = EagerSingleton.getInstance();

		System.out.println("eagerSingleton1 == eagerSingleton2 " + (eagerSingleton1 == eagerSingleton2));
		System.out.println("eagerSingleton2 == eagerSingleton3 " + (eagerSingleton2 == eagerSingleton3));
		System.out.println("eagerSingleton1 == eagerSingleton3 " + (eagerSingleton1 == eagerSingleton3));

		System.out.println("==========");

		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		LazySingleton lazySingleton3 = LazySingleton.getInstance();

		System.out.println("lazySingleton1 == lazySingleton2 " + (lazySingleton1 == lazySingleton2));
		System.out.println("lazySingleton2 == lazySingleton3 " + (lazySingleton2 == lazySingleton3));
		System.out.println("lazySingleton1 == lazySingleton3 " + (lazySingleton1 == lazySingleton3));
	}
}
