package com.example.gof.behavioral.command.command;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Fan {

	private @Getter boolean isOn = false;

	public void turnOn() {
		this.isOn = true;
		System.out.println("Fan is on");
	}

	public void turnOff() {
		this.isOn = false;
		System.out.println("Fan is off");
	}
}
