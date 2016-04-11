package com.lidaming.design02.factorymethod;

public class YellowHumanFactory implements IAbstractHumanFactory {

	public IHuman creator() {
		try {
			return YellowHuman.class.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
