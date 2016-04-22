package com.lidaming.design15.observer;

public class ConcreteMember implements IMember {

	private String name;
	

	

	public ConcreteMember(String name) {
		this.name = name;
	}

	public void action(Leader leader) {
		System.out.println("leader's cmd is:"+leader.getState());
		System.out.println(this.name + " begin action!");
	}

}
