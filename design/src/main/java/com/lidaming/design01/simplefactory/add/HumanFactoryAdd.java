package com.lidaming.design01.simplefactory.add;

import com.lidaming.design01.simplefactory.BlackHuman;
import com.lidaming.design01.simplefactory.IHuman;
import com.lidaming.design01.simplefactory.WhiteHuman;
import com.lidaming.design01.simplefactory.YellowHuman;

public class HumanFactoryAdd {
	public static IHuman getInstance(String color)
			throws InstantiationException, IllegalAccessException {
		if (color.equals("white")) {
			return WhiteHuman.class.newInstance();

		} else if (color.equals("black")) {
			return BlackHuman.class.newInstance();
		} else if (color.equals("yellow")) {
			return YellowHuman.class.newInstance();
		}else if(color.equals("brown")) {
			// 新加人种棕色人种
			return BrownHuman.class.newInstance();
		}
		
		else {
			System.out.println("no human:" + color);
			return null;
		}
	}
}
