package com.lidaming.design12.composite;

public class Client {
	public static void main(String[] args) {
		Adult root = new Adult("Mr Li");
		IHuman jack=new Child("Jack");
		root.add(jack);
		IHuman tom=new Child("Tom");
		root.add(tom);
		root.display();
	}
}
