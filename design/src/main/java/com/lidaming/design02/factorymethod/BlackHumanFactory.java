package com.lidaming.design02.factorymethod;

public class BlackHumanFactory implements IAbstractHumanFactory {

	public IHuman creator() {
		try {
			return BlackHuman.class.newInstance();
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
