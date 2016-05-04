package com.lidaming.design20.visitor;

public class Client {

	public static void main(String[] args) {
		Engineer engineer = new Engineer();
		Car car = new Car();
		car.accept(engineer);
	}

}
