package com.onesoft.forloop1;

public class SquareCubeProgram {
	public static void main(String[]args) {
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even Square="+i*i);
			}
			else {
				System.out.println("Odd Cube="+i*i*i);
				
			}
		}
		
	}

}
