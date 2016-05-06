package com.lidaming.design21.mediator;

public class CPU extends Colleage {
	private String vedioData;
	private String soundData;

	public CPU(IMediator m) {
		super(m);
	}

	public String getVedioData() {
		return vedioData;
	}

	public String getSoundData() {
		return soundData;
	}

	public void processData(String data) {
		String[] arr = data.split(",");
		soundData = arr[0];
		vedioData = arr[1];

		getMediator().changed(this);
	}

}
