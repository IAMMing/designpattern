package com.lidaming.design10.decorator;

public class HumanDecorator implements IHuman {

	IHuman human = null;

	public HumanDecorator(IHuman human) {
		this.human = human;
	}

	public void create() {
		human.create();
		breath();
	}

	private void breath() {
		System.out.println("breath first");
	}

}
