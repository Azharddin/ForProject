package com.onesoft.forloop1;

public class FindAverage {
public static void main(String[]args) {
	int total=0;
	int count=0;
	for(int i=0;i<=10;i++) {
		total=total+i;
		count=count+1;
	}
	System.out.println(total/count);
}
}
