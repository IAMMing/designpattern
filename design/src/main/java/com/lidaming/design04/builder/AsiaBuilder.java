package com.lidaming.design04.builder;

public class AsiaBuilder implements IBuilder {

	Human human = new Human();

	public void buildHair() {
		if (human.getBody().equals(null)) {
			System.out.println("this man has no body now");
			return;
		}
		human.setHair(new ShortBlackHair());

	}

	public void buildBody() {
		human.setBody(new LongYellowMan());

	}

	public Human getHuman() {
		// TODO Auto-generated method stub
		return human;
	}

}
