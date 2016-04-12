package com.lidaming.design04.builder;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		IBuilder builder = new ConcreteBuilder();
		director.construct(builder);
		Human human = builder.getHuman();
		human.show();

		builder = new AsiaBuilder();
		director.construct(builder);
		human = builder.getHuman();
		human.show();

	}
}
