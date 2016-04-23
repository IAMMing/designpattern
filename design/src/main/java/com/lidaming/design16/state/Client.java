package com.lidaming.design16.state;

public class Client {
	public static void main(String[] args) {
		HumanContext ctx = new HumanContext(new Sleep());
		ctx.action();
		ctx.action();
		ctx.action();
		ctx.action();
	}
}
