package com.lidaming.design20.visitor;

public class Engine implements IPart {

	public void accept(IWorker worker) {
		worker.visit(this);
	}

}
