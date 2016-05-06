package com.lidaming.design21.mediator;

public class Client {
	public static void main(String[] args) {
		MainBoard mainBoard = new MainBoard();

		CDDriver cdDriver = new CDDriver(mainBoard);
		CPU cpu = new CPU(mainBoard);
		SoundCard soundCard = new SoundCard(mainBoard);
		VedioCard vedioCard = new VedioCard(mainBoard);
		
		mainBoard.setCd(cdDriver);
		mainBoard.setCpu(cpu);
		mainBoard.setSound(soundCard);
		mainBoard.setVedio(vedioCard);
		
		cdDriver.readCD();
		
		
	}
}
