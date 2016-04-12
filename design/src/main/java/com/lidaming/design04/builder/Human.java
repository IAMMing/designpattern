package com.lidaming.design04.builder;

public class Human {
	private IBody body;
	
	public IBody getBody() {
		return body;
	}

	public void setBody(IBody body) {
		this.body = body;
	}

	private IHair hair;

	public IHair getHair() {
		return hair;
	}

	public void setHair(IHair hair) {
		this.hair = hair;
	}
	
	public void show()
	{
		System.out.print("this man ");
		if(body!=null)
			System.out.print(" is "+body.height()+" "+body.color()+" and ");
		if(hair!=null)
			System.out.print("has "+hair.length()+" "+hair.color()+" hair");
		
		System.out.println();
		
	}
}
