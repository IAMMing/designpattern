package com.lidaming.design19.command;

public class ConcreteCommand implements ICommand {
	Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.action();
	}

}
