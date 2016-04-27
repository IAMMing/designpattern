package com.lidaming.design18.chain;

public class ToolMananger extends AbstractHuman {

	@Override
	public void process(String need) {
		if(need=="tool")
		{
			System.out.println("give you a tool");
		}
		else
		{
			if(human!=null)
			{
				human.process(need);
			}
			else
			{
				System.out.println("sorry,we can not for you");
			}
		}
	}

}
