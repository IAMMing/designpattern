package com.lidaming.design11.bridge;

public class OldMan extends Human {

	public OldMan(IAction action) {
		super(action);
	}

	@Override
	public void party() {
		System.out.print("old man ");
		action.action();

	}
}
