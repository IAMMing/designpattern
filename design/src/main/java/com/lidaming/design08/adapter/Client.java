package com.lidaming.design08.adapter;

import com.lidaming.design08.adapterclass.ClazzAdapterHuman;
import com.lidaming.design08.adapterdefault.WalkHuman;
import com.lidaming.design08.adapterobject.ObjectAdapterHuman;

public class Client {
	public static void main(String[] args) {
		IAction humanAction = new ClazzAdapterHuman();
		humanAction.eat();
		
		humanAction=new ObjectAdapterHuman();
		humanAction.eat();
		
		humanAction=new WalkHuman();
		humanAction.eat();
		humanAction.walk();
	}
}
