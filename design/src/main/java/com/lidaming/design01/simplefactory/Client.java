package com.lidaming.design01.simplefactory;

public class Client {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		IHuman white = HumanFactory.getInstance("white");
		white.color();
		IHuman black = HumanFactory.getInstance("black");
		black.color();
	}
}
