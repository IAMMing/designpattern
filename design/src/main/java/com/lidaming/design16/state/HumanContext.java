package com.lidaming.design16.state;

public class HumanContext {
	private IState state;

	public HumanContext(IState state) {
		this.state = state;
	}

	public void setState(IState state) {
		this.state = state;
	}

	public void action() {
		state.handle(this);
	}
}
