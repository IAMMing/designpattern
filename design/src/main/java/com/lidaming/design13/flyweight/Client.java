package com.lidaming.design13.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<String> compositeNames = new ArrayList<String>();
		compositeNames.add("a");
		compositeNames.add("b");
		compositeNames.add("c");
		compositeNames.add("d");

		ToolFactory toolFactory = new ToolFactory();
		ITool compositeTool2 = toolFactory.factory(compositeNames);
		ITool compositeTool1 = toolFactory.factory(compositeNames);
		compositeTool1.produce("ddd");
		
		
		ITool tool1 = toolFactory.factory("e");
		ITool tool2 = toolFactory.factory("e");
		System.out.println("-----------------");
		System.out.println("组合享元类能否共享：" + (compositeTool1 == compositeTool2));
		System.out.println("单纯享元类能否共享：" + (tool1 == tool2));

	}
}
