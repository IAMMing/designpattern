package com.lidaming.design;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {	
		try {
			Object obj = Class.forName("com.lidaming.design.TestObj")
					.newInstance();
			if (obj instanceof TestObj) {
				TestObj o = (TestObj) obj;
				System.out.println(o.getStr());
			} else
				System.out.println(0);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
