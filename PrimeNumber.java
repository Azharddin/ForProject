
package com.onesoft.forloop1;

public class PrimeNumber {
	public static void main(String[]args) {
		int num=7;
		boolean a=true;
		for(int i=2;i<num;i++) {
			if(i%num==0) {
				a=false;
			}
		}
		if(a==true) {
			System.out.println("Is Prime Number");
			
		}
		else {
			System.out.println("Is Not Prime Number");
		}
	}

}
