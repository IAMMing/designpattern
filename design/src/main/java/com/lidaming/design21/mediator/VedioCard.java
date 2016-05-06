package com.lidaming.design21.mediator;

public class VedioCard extends Colleage {

	public VedioCard(IMediator m) {
		super(m);
	}
	
	public void showData(String data)
	{
		System.out.println("show data:"+data);
	}

}
