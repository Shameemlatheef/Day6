package com.day6;

import java.util.Scanner;

public class Main {
	
public static String reverseString(String imp) {
	String bag="";
	int g=imp.length()-1;
	
	for(int i=g;i>=0;i--)
	{
		bag =bag + imp.charAt(i);
	}
	return bag;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String sc=s.next();
		String Result=reverseString(sc);
		
		System.out.println("Original String is :"+ sc);
		System.out.println("Reversed String is :"+ Result);
		System.out.println(sc.length()-1);
		
	}

}
