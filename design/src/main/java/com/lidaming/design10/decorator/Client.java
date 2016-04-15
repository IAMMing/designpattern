package com.lidaming.design10.decorator;

public class Client {
	public static void main(String[] args) {
		IHuman human = new HumanDecorator(new Human());
		human.create();
	}
}
