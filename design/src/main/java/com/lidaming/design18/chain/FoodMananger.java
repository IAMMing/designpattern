package com.lidaming.design18.chain;

public class FoodMananger extends AbstractHuman {
 
	@Override
	public void process(String need) {
		if(need=="food")
		{
			System.out.println("food is enough");
		}
		else
		{
			if(human!=null)
			{
				human.process(need);
			}
			else
			{
				System.out.println("sorry,i have no food");
			}
		}
	}

}
