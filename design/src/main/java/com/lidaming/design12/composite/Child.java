package com.lidaming.design12.composite;

public class Child extends Human {

	public Child(String name) {
		super(name);
		
	}

	@Override
	public void display() {
		System.out.println("child-"+this.name);
		
	}


}
