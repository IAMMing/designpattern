package com.lidaming.design;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {	
		int i=10;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DataOutputStream dout = new DataOutputStream(out);
		try {
			dout.writeInt(i);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		byte[] bytes=out.toByteArray();
		
		for (byte b : bytes) {
			System.out.println(b+"");
		}
		try {
			out.close();
			dout.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(bytes);
		
		
		ByteArrayInputStream input = new ByteArrayInputStream(bytes);
		DataInputStream dinput = new DataInputStream(input);
		try {
			int x=dinput.readInt();
			System.out.println(x);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int b=1;
		int a=b>>3;
		System.out.println(a);
//		try {
//			Object obj = Class.forName("com.lidaming.design.TestObj")
//					.newInstance();
//			if (obj instanceof TestObj) {
//				TestObj o = (TestObj) obj;
//				System.out.println(o.getStr());
//			} else
//				System.out.println(0);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
