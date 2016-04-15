package com.lidaming.design09.proxy;

public class HumanProxy implements IHuman {

	private Human human = new Human();
	private boolean canProduce = false;
	private boolean hasMan;
	private boolean hasWoman;

	public HumanProxy(boolean hasMan, boolean hasWoman) {
		this.hasMan = hasMan;

		this.hasWoman = hasWoman;
	}

	private void pre() {
		if (!hasMan) {
			System.out.println("has no man");
			return;
		}
		if (!hasWoman) {
			System.out.println("has no woman");
			return;
		}
		canProduce = true;
	}

	public void produce() {
		pre();
		if (canProduce) {
			human.produce();
		} else {
			System.out.println("can not produce human");
		}
		post();
	}

	private void post() {
		System.out.println("finished produced");
	}

}
