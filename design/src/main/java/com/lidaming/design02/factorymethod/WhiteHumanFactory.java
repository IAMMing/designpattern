package com.lidaming.design02.factorymethod;

public class WhiteHumanFactory implements IAbstractHumanFactory {

	public IHuman creator() {
		
		
		try {
			return WhiteHuman.class.newInstance();
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
