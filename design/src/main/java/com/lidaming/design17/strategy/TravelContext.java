package com.lidaming.design17.strategy;

public class TravelContext {
	private ITravelStrategy travelStrategy;

	public TravelContext(ITravelStrategy strategy) {
		travelStrategy = strategy;
	}

	public void setStrategy(ITravelStrategy strategy) {
		travelStrategy = strategy;
	}

	public void travel() {
		travelStrategy.travel();
	}
}
