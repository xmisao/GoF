package com.xmisao.gof.composite;

public class Client {
	public static void main(String[] args) {
		// building tree
		//
		//           root
		//           /  \
		//         leaf composite
		//                 /  \
		//              leaf  composite
		//
		Component root = new Composite();
		root.add(new Leaf());
		root.add(new Composite());
		root.getChild(1).add(new Leaf());
		root.getChild(1).add(new Composite());
		root.operation();
	}
}
