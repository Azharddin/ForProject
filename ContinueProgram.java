package com.onesoft.forloop1;

public class ContinueProgram {
	public static void main(String[]args) {
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
