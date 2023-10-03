package com.onesoft.forloop1;

public class BreakSkipProgram {
	public static void main(String[]args) {
		for(int i=1;i<=10;i++) {
			if(i%7==0) {
				break;
			}
			else {
				System.out.println(i);
			}
		}
		String a="everythring";
		String s="";
		for(int i=0;i<=a.length()-1;i++) {
			s+=s.charAt(i);
			System.out.println(s);
		}
	}

}
