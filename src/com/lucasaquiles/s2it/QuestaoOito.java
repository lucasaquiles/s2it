package com.lucasaquiles.s2it;

public class QuestaoOito {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 512;
		int c;
		
		StringBuilder builder = new StringBuilder();
		
		String valueA = String.valueOf(a);
		String valueB = String.valueOf(b);
		
		String initAt = valueA.length() > valueB.length()?valueA:valueB;
		
		for(int i = 0; i < initAt.length(); i++){
			
			if(i < valueA.length()){
				
				builder.append(valueA.substring(i, i+1));
			}
			
			if(i < valueB.length()){
				
				builder.append(valueB.substring(i, i+1));
			}
		}
		
		c = Integer.parseInt(builder.toString());
		
		if(c > 1000000){
			c = -1;
		}
		System.out.println(c);
	}
	
	public void concat(String value){
		
	}
}
