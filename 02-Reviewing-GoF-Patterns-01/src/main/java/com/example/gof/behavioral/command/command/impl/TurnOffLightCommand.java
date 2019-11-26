package com.example.gof.behavioral.command.command.impl;

import com.example.gof.behavioral.command.command.Command;
import com.example.gof.behavioral.command.command.Light;

public class TurnOffLightCommand implements Command {

	private Light light;

	public TurnOffLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void executeCommand() {
		System.out.println("Turning off light.");
		this.light.turnOff();
	}

}
