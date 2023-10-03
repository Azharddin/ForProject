package com.onesoft.forloop1;

public class FindEvenOddCount {
	public static void main(String[]arg) {
		int e=0;
		int o=0;
		for(int i=0;i<=5;i++) {
			if(i%2==0) {
				e++;
				
			}
			else {
				o++;
			}
		}
			System.out.println("Even count="+e);
			System.out.println("Odd count="+o);
		}
	}



