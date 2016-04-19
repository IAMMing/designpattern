package com.lidaming.design13.flyweight;

public class ConcreteTool implements ITool {
	private String name;

	public ConcreteTool(String intenal) {
		this.name = intenal;
	}

	public void produce(String ext) {
		System.out.println("flyweight intenal:" + this.name);
		System.out.println("flyweight ext:" + ext);
	}

}
