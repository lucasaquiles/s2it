package com.lucasaquiles.s2it;

public class QuestaoNove {

	
	public static void main(String[] args) {
		
		
		BinaryTree a = new BinaryTree();
		a.valor = 2;
		
		a.left = new BinaryTree();
		a.left.valor = 3;
		
		a.left.left = new BinaryTree();
		a.left.left.valor = 4172;
		
		a.right = new BinaryTree();
		a.right.valor = 10;
		
		int calcularNo = a.calcularNo(a.left);
		
		System.out.println(calcularNo);
	}
}
