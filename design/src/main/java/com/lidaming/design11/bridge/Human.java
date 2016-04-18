package com.lidaming.design11.bridge;

public abstract class Human implements IHuman {

	protected IAction action;

	public Human(IAction action) {
		this.action = action;
	}

	public abstract void party();

}
