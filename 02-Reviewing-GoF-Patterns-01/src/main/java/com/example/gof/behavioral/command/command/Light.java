package com.example.gof.behavioral.command.command;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Light {

	private @Getter boolean isOn = false;

	public void turnOn() {
		this.isOn = true;
		System.out.println("Light is on");
	}

	public void turnOff() {
		this.isOn = false;
		System.out.println("Light is off");
	}
}
