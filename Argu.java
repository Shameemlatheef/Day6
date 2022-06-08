package com.day6;

public class Argu {
public static void main(String[] args) {
	if(args.length==1) {
		int sum=1;
		for(int i=1;i<=Integer.parseInt(args[0]);i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
	}
	if(args.length==2) {
		int x=Integer.parseInt(args[0])-Integer.parseInt(args[1]);
		if(x<0) {
			System.out.println(x*(-1));
		}
		else {
			System.out.println(x);
		}
	}
	if(args.length>=3) {
		System.out.println("Error");
	}
}
}
