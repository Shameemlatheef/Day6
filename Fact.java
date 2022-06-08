package com.day6;

public class Fact {
int [][] arr= { {1,2,3},{4,5,6},{7,8,9} };
//int [] mar= {1,2,3,4,5,6};

public static void main(String[] args) {
	Fact f=new Fact();
	//System.out.println(f.arr[0].length);
	//System.out.println(f.arr.length);
	
	
	
	for(int i=0;i<f.arr.length;i++)
	{ 
		int sum=0;
		for(int j=0;j<f.arr[0].length;j++)
		{
			if(f.arr[j][i]%2==0) {
				sum+=f.arr[j][i];
			}
		}
		System.out.println(sum);
	}
	
	
	
	//int count=0;
	
	
}
}
