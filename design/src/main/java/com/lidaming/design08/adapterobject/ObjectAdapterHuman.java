package com.lidaming.design08.adapterobject;

import com.lidaming.design08.adapter.Human;
import com.lidaming.design08.adapter.IAction;

public class ObjectAdapterHuman implements IAction {

	Human human = new Human();

	public void eat() {
		System.out.println("call human eat");
		human.eat();
	}

	public void sleep() {
		System.out.println(" object adapter human sleep");

	}

	public void breath() {
		System.out.println(" object adapter human breath");
	}

	public void speak() {
		System.out.println(" object adapter human speak");
	}

	public void walk() {
		System.out.println(" object adapter human walk");
	}

}
