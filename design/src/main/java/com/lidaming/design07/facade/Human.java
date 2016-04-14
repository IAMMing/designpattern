package com.lidaming.design07.facade;
/**
 * 外观类
 * @author admin
 *
 */
public class Human {
	Body body = new Body();
	Heart heart = new Heart();
	Brain brain = new Brain();
	
	public void make() {
		body.makeBody();
		brain.makeBrain();
		System.out.println("put brain into body");
		heart.makeHeart();
		System.out.println("put heart into body");
		System.out.println("finished a human");		
	}
	public void kill()
	{
		brain.destoryBrain();
		heart.destoryHeart();
		body.destroyBody();
	}
}
