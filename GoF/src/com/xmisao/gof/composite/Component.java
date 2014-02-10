package com.xmisao.gof.composite;

public abstract class Component {
	abstract public void operation();
	
	public void add(Component component){
		throw new UnsupportedOperationException();
	}
	
	public void remove(Component component){
		throw new UnsupportedOperationException();	
	}
	
	public Component getChild(int i){
		return null;
	}
}