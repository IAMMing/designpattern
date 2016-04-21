package com.lidaming.design14.template;

public class Client {
	public static void main(String[] args) {
		Human human = new HanMei();
		human.go();
		
		human=new LiLei();
		human.go();
	}
}
