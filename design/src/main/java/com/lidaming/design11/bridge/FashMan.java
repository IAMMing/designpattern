package com.lidaming.design11.bridge;

public class FashMan extends Human {

	public FashMan(IAction action) {
		super(action);
	}

	@Override
	public void party() {
		System.out.print(" fashion man ");
		action.action();
	}

}
