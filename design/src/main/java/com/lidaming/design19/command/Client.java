package com.lidaming.design19.command;

public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		ConcreteCommand command = new ConcreteCommand(receiver);
		
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.doCommand();
	}
}
