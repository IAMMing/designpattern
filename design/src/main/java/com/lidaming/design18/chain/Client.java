package com.lidaming.design18.chain;

public class Client {
	public static void main(String[] args) {

		FoodMananger food = new FoodMananger();
		ToolMananger tool = new ToolMananger();
		HumanManager human = new HumanManager();

		food.setHuman(tool);
		tool.setHuman(human);

		food.process("tool");
		food.process("aa");
	}
}
