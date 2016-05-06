package com.lidaming.design21.mediator;

public class CDDriver extends Colleage {
	private String data;

	public CDDriver(IMediator m) {
		super(m);
	}

	public void readCD() {
		data = "voice,vedio";
		getMediator().changed(this);
	}
	
	public String getData()
	{
		return data;
	}

}
