package com.example.gof.behavioral.command;

import com.example.gof.behavioral.command.command.Fan;
import com.example.gof.behavioral.command.command.Light;
import com.example.gof.behavioral.command.command.impl.StartFanCommand;
import com.example.gof.behavioral.command.command.impl.StopFanCommand;
import com.example.gof.behavioral.command.command.impl.TurnOffLightCommand;
import com.example.gof.behavioral.command.command.impl.TurnOnLightCommand;

public class Main {

	public static void main(String[] args) {

		Remote remote = new Remote();

		Light livingRoomLight = new Light();
		Fan livingRoomFan = new Fan();

		remote.setCommand(new TurnOnLightCommand(livingRoomLight));
		remote.pressButton();

		System.out.println("==========");

		remote.setCommand(new TurnOffLightCommand(livingRoomLight));
		remote.pressButton();

		System.out.println("==========");

		remote.setCommand(new StartFanCommand(livingRoomFan));
		remote.pressButton();

		System.out.println("==========");

		remote.setCommand(new StopFanCommand(livingRoomFan));
		remote.pressButton();
	}

}
