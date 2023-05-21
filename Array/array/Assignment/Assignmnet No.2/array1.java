Program 1:
Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and find the sum of all elements in the array.
Input:
n=6

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
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=arr[i]+sum;
		}
		System.out.println("Sum of All Element in Array is: "+sum);
	}
}


