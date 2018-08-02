package com.lucasaquiles.s2it;

public class BinaryTree {
	
	int valor;
	BinaryTree left;
	BinaryTree right;
	
	
	
	public int calcularNo(BinaryTree node){
		int soma = node.valor;
		
		BinaryTree leftNode = node.left;
		BinaryTree rightNode = node.right;
		
		while(leftNode != null){
			
			soma = soma+leftNode.valor;
			leftNode = leftNode.left;
		}
		
		while(rightNode != null){
			
			soma = soma+rightNode.valor;
			rightNode = rightNode.right;
		}
		
		return soma;
	}
}
