package com.lidaming.design04.builder;

public class Director {
	public void construct(IBuilder builder) {
		builder.buildBody();
		builder.buildHair();
	}
}
