package com.lidaming.design16.state;

public class Awake implements IState {

	public void handle(HumanContext ctx) {
		System.out.println("awake-stand,can talk,eat,drink");
		ctx.setState(new Sleep());
	}

}
