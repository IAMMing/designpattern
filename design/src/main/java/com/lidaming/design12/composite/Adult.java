package com.lidaming.design12.composite;

import java.util.ArrayList;
import java.util.List;

public class Adult extends Human {

	List<IHuman> childs=new ArrayList<IHuman>();
	public Adult(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("adult-" + this.name);
		for (IHuman iHuman : childs) {
			iHuman.display();
		}
	}

	public void add(IHuman child)
	{
		childs.add(child);
	}
	public void remove(int i)
	{
		childs.remove(i);
	}
	public List<IHuman> getChilds()
	{
		return childs;
	}
}
