package com.xmisao.gof.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	private List<Component> components = new ArrayList<Component>();
	
	@Override
	public void operation() {
		System.out.println("This is Composite.");
		for(Component component : components){
			component.operation();
		}
	}
	
	@Override
	public void add(Component component){
		components.add(component);
	}
	
	@Override
	public void remove(Component component){
		components.remove(component);
	}
	
	@Override	
	public Component getChild(int i){
		return components.get(i);
	}
}
