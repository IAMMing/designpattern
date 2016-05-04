package com.lidaming.design20.visitor;

public class Wheel implements IPart {

	public void accept(IWorker worker) {
		worker.visit(this);
	}

}
