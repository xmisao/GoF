package com.xmisao.gof.factorymethod;

public class ConcreteCreator extends Creator{
	@Override
	public Product factoryMethod() {
		return new ConcreteProduct();
	}
}
