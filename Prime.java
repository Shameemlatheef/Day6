package com.day6;

public class Prime {
	int[] arr = {10,12,5,50,11,14,15};
	int [] se=new int[5];
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
		
		
		for(int h=0;h<arr.length;h++)
		{  int count=0;
			for(int t=1;t<h;t++)
			{
				if(arr[h]%t==0) {
					count++;
				}
			}
			//System.out.println(count);
			if(count==3) {
				System.out.println("prime "+h);
				return arr;
			}
			
				System.out.println("non prime");
				
				return arr ;
			
			
			}
		
		}
		public static void main(String[] args){
		//Create the object of Main class
			Prime f=new Prime();
			f.findAndReturnPrimeNumbers(f.arr);
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
		//message:
		// "Prime number not found in the supplied Array"
		}
}
