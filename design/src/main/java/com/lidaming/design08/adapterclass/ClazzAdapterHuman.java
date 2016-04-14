package com.lidaming.design08.adapterclass;

import com.lidaming.design08.adapter.Human;
import com.lidaming.design08.adapter.IAction;
/**
 * 适配器类
 * @author admin
 *
 */
public class ClazzAdapterHuman extends Human implements IAction {

	public void sleep() {
		System.out.println(" class adapter human sleep");
	}

	public void breath() {
		System.out.println(" class adapter human breath");
	}

	public void speak() {
		System.out.println(" class adapter human speak");
	}

	public void walk() {
		System.out.println(" class adapter human walk");
	}

}
