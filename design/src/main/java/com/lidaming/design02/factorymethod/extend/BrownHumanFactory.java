package com.lidaming.design02.factorymethod.extend;

import com.lidaming.design02.factorymethod.IAbstractHumanFactory;
import com.lidaming.design02.factorymethod.IHuman;

public class BrownHumanFactory implements IAbstractHumanFactory {

	public IHuman creator() {
		try {
			return BrownHuman.class.newInstance();
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
