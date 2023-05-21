Program 3:
Write a Java program to find the sum of even and odd numbers in an array.
Display the sum value.
Input: 11 12 13 14 15.

import java.io.*;
class Array{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int esum=0,osum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				esum=esum+arr[i];
				
			}else{
				osum=osum+arr[i];
				
			}
		}
		System.out.println("Sum of Even Number is: "+esum);
		System.out.println("Sum of Odd Number is: "+osum);
	}
}
