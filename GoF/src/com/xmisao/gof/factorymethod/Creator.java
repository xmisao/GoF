package com.xmisao.gof.factorymethod;

public abstract class Creator {
	abstract Product factoryMethod();
	
	public void anOperation(){
		Product product = factoryMethod();
	}
}
