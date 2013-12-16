package com.xmisao.gof.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<AbstractFactory> factories = new ArrayList<AbstractFactory>();
		factories.add(new ConcreteFactory1());
		factories.add(new ConcreteFactory2());
		
		for(AbstractFactory factory : factories){
			AbstractProductA productA = factory.createProductA();
			productA.methodA();
			AbstractProductB productB = factory.createProductB();
			productB.methodB();
		}
	}
}
