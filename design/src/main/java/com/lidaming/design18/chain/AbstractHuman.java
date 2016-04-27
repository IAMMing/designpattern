package com.lidaming.design18.chain;

public abstract class AbstractHuman {
	public AbstractHuman human;
	public void setHuman(AbstractHuman huamn){
		this.human=huamn;
	}
	public abstract void process(String need);
}
