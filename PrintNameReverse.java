package com.onesoft.forloop1;

public class PrintNameReverse {
	public static void main(String[]args) {
		String word="Dog";
		String temp=" ";
		for(int i=word.length()-1;i>=0;i--) {
		temp=temp+word.charAt(i);
		System.out.println(temp);
		}
		
	}

}
