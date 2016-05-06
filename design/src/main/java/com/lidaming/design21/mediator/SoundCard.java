package com.lidaming.design21.mediator;

public class SoundCard extends Colleage {

	public SoundCard(IMediator m) {
		super(m);
	}
	
	public void soundData(String data)
	{
		System.out.println("sound data:"+data);
	}

}
