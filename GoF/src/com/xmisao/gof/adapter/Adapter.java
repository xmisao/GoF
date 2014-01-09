package com.xmisao.gof.adapter;

public class Adapter implements ITarget{
	Adaptee adaptee;

	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	@Override
	public void request() {
		adaptee.specificRequest();		
	}

}
