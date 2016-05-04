package com.lidaming.design20.visitor;

public interface IWorker {
	void visit(Engine e);

	void visit(Wheel e);

	void visit(Car e);
}
