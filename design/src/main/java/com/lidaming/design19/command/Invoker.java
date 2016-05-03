package com.lidaming.design19.command;

public class Invoker {
	ICommand command;
	public void setCommand(ICommand command)
	{
		this.command=command;
	}
	public void doCommand()
	{
		command.execute();
	}
}
