package com.onesoft.forloop1;

public class VowelsCount {
	public static void main(String[]args) {
		String word="Jave";
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("Vowels count is ="+count);
	}

}
