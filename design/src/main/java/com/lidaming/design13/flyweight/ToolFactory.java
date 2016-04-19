package com.lidaming.design13.flyweight;

import java.util.HashMap;
import java.util.List;

public class ToolFactory {
	HashMap<String, ITool> tools = new HashMap<String, ITool>();

	/**
	 * 组合享元类
	 * 
	 * @param compositeNames
	 * @return
	 */
	public ITool factory(List<String> compositeNames) {
		ConcreteCompositeTool compositeTool = new ConcreteCompositeTool();
		for (String item : compositeNames) {
			compositeTool.add(item, factory(item));
		}
		return compositeTool;
	}

	/**
	 * 单纯享元方法
	 * 
	 * @param intenal
	 * @return
	 */
	public ITool factory(String intenal) {
		ITool tool = tools.get(intenal);
		if (tool == null) {
			tool = new ConcreteTool(intenal);
			tools.put(intenal, tool);
		}
		return tool;
	}

}
