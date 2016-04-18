package com.lidaming.design12.composite;

public abstract class Human implements IHuman {
	protected String name;

	public Human(String name) {
		this.name = name;
	}

	public abstract void display();
}
