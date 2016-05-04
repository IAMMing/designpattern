package com.lidaming.design20.visitor;

public class Car implements IPart {

	private Engine engine = new Engine();
	private Wheel wheel = new Wheel();

	public void accept(IWorker worker) {
		wheel.accept(worker);
		engine.accept(worker);
		worker.visit(this);
	}

}
