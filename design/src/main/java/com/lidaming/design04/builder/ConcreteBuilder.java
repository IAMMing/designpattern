package com.lidaming.design04.builder;

public class ConcreteBuilder implements IBuilder {

	Human human = new Human();

	public void buildHair() {
		if (!human.getBody().equals(null)) {
			human.setHair(new LongWhiteHair());
		} else {
			System.out.println(" this man has no body now!");
		}
	}

	public void buildBody() {
		human.setBody(new BlackHighMan());

	}

	public Human getHuman() {

		return human;
	}

}
