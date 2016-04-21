package com.lidaming.design14.template;

public class HanMei extends Human {

	@Override
	public boolean isGirl() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public void dressUp() {
		System.out.println("be a beauty");

	}

	@Override
	public void chooseClothes() {
		System.out.println("choose a beautiful dress");
	}

}
