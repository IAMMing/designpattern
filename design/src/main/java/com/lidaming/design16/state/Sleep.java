package com.lidaming.design16.state;

public class Sleep implements IState {

	public void handle(HumanContext ctx) {
		System.out.println("sleeping-can not eat,speak,drink");
		ctx.setState(new Awake());
		
	}

}
