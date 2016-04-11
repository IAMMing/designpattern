package com.lidaming.design02.factorymethod;

import com.lidaming.design02.factorymethod.extend.BrownHumanFactory;

public class Client {
	public static void main(String[] args) {
		// 直接调用
		// IAbstractHumanFactory factory = new WhiteHumanFactory();
		// IHuman human = factory.creator();
		// human.color();
		//
		// factory=new BlackHumanFactory();
		// human=factory.creator();
		// human.color();
		
		// 也可以这样调用
		try {
			show(WhiteHumanFactory.class);
			show(YellowHumanFactory.class);
			show(BrownHumanFactory.class);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	static void show(Class<? extends IAbstractHumanFactory> clazz) throws InstantiationException, IllegalAccessException
	{
		IAbstractHumanFactory factory = clazz.newInstance();
		IHuman human = factory.creator();
		human.color();
	}
}
