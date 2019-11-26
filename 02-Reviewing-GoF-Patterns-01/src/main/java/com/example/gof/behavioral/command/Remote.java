package com.example.gof.behavioral.command;

import com.example.gof.behavioral.command.command.Command;

public class Remote {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		this.command.executeCommand();
	}

}