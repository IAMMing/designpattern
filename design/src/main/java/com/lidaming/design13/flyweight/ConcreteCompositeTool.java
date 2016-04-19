package com.lidaming.design13.flyweight;

import java.util.HashMap;

public class ConcreteCompositeTool implements ITool {

	HashMap<String, ITool> tools = new HashMap<String, ITool>();

	public void add(String key, ITool tool) {
		tools.put(key, tool);
	}

	public void produce(String ext) {
		ITool tool = null;
		for (String item : tools.keySet()) {
			tool = tools.get(item);
			tool.produce(ext);
		}
	}

}
