package com.lidaming.design09.proxy;

public class Client {
	public static void main(String[] args) {
		HumanProxy proxy = new HumanProxy(true, false);
		proxy.produce();

		proxy = new HumanProxy(true, true);
		proxy.produce();
	}
}
