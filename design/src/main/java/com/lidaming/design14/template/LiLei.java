package com.lidaming.design14.template;

public class LiLei extends Human {

	@Override
	public boolean isGirl() {
		return false;
	}

	@Override
	public void dressUp() {
		System.out.println("boy need not dress up");

	}

	@Override
	public void chooseClothes() {
		System.out.println("choose a cool coat");
	}

}
