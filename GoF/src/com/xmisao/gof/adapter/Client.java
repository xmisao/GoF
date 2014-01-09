package com.xmisao.gof.adapter;

public class Client {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		ITarget target = new Adapter(adaptee);
		target.request();
	}
}