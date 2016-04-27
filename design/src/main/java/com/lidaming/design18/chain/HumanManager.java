package com.lidaming.design18.chain;

public class HumanManager extends AbstractHuman {

	@Override
	public void process(String need) {
		if (need.equals("job")) {
			System.out.println("give u an offer");
		} else {
			if (human != null) {
				human.process(need);
			} else {
				System.out.println("no offer for u");
			}
		}
	}

}
