package com.example.gof.behavioral.command.command.impl;

import com.example.gof.behavioral.command.command.Command;
import com.example.gof.behavioral.command.command.Light;

public class TurnOnLightCommand implements Command {

	private Light light;

	public TurnOnLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void executeCommand() {
		System.out.println("Turning on light.");
		this.light.turnOn();
	}

}
