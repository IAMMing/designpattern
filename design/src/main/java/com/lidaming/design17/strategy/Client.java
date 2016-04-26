package com.lidaming.design17.strategy;

public class Client {
	public static void main(String[] args) {
		TravelContext travelContext = new TravelContext(new Bike());
		travelContext.travel();
		
		System.out.println("it takes too long");
		
		travelContext.setStrategy(new Bus());
		travelContext.travel();
		
		
		System.out.println("it is too expensive");
		
		travelContext.setStrategy(new Train());
		travelContext.travel();
		
		System.out.println("it just fine");
	}
}
