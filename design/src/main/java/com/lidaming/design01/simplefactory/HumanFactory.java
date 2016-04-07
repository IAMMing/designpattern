package com.lidaming.design01.simplefactory;

public class HumanFactory {

	public static IHuman getInstance(String color)
			throws InstantiationException, IllegalAccessException {
		if (color.equals("white")) {
			return WhiteHuman.class.newInstance();

		} else if (color.equals("black")) {
			return BlackHuman.class.newInstance();
		} else if (color.equals("yellow")) {
			return YellowHuman.class.newInstance();
		} else {
			System.out.println("no human:" + color);
			return null;
		}
	}
}
