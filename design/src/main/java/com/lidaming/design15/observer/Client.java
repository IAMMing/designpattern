package com.lidaming.design15.observer;

public class Client {
	public static void main(String[] args) {
		Leader leader = new ConcreteLeader();
		leader.register(new ConcreteMember("Andy"));
		leader.register(new ConcreteMember("Zero"));
		
		leader.notifyMember();
	}
}
