package com.example.gof.behavioral.command.command.impl;

import com.example.gof.behavioral.command.command.Command;
import com.example.gof.behavioral.command.command.Fan;

public class StopFanCommand implements Command {

	private Fan fan;

	public StopFanCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void executeCommand() {
		System.out.println("Stopping fan.");
		this.fan.turnOff();
	}

}
