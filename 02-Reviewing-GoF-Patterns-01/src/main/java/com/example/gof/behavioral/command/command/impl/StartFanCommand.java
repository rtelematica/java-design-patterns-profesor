package com.example.gof.behavioral.command.command.impl;

import com.example.gof.behavioral.command.command.Command;
import com.example.gof.behavioral.command.command.Fan;

public class StartFanCommand implements Command {

	private Fan fan;

	public StartFanCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void executeCommand() {
		System.out.println("Starting fan.");
		this.fan.turnOn();
	}

}
