package com.lidaming.design11.bridge;

public class Client {
	public static void main(String[] args) {
		IHuman human = new FashMan(new DriveAction());
		human.party();
		
		human=new OldMan(new WalkAction());
		human.party();
	}
}
