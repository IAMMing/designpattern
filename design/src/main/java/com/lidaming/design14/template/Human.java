package com.lidaming.design14.template;

public abstract class Human {
	public boolean isGirl()
	{
		return false;
	}
	public abstract void dressUp();
	public abstract void chooseClothes();
	public void go()
	{
		if(isGirl())
		{
			dressUp();
		}
		chooseClothes();
		System.out.println("Ready?GO!");
	}
}
