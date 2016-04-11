package com.lidaming.design03.abstractfactory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory factory = new AsiaFactory();
		IHuman human = factory.createHuman();
		human.color();
		IFruit fruit = factory.createFruite();
		fruit.locate();

		factory = new Europe();
		human = factory.createHuman();
		human.color();
		fruit = factory.createFruite();
		fruit.locate();
	}
}
