package com.lidaming.design21.mediator;

public abstract class Colleage {
	private IMediator mediator;

	public Colleage(IMediator m) {
		mediator = m;
	}

	public IMediator getMediator() {
		return mediator;
	}
}
