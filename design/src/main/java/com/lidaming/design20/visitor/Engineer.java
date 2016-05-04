package com.lidaming.design20.visitor;

public class Engineer implements IWorker {

	public void visit(Engine e) {
		System.out.println("check engine...");
	}

	public void visit(Wheel e) {
		System.out.println("check wheel...");
	}

	public void visit(Car e) {
		System.out.println("check car ...");
	}

}
